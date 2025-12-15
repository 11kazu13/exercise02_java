package exercise02.test;

// JUnit4のアサーションメソッドをインポート
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exercise02.Contact;

public class ContactTest {

    // テスト対象のContactインスタンス
    private Contact contact;

    // 各テストの実行前に呼ばれる初期化処理
    @Before
    public void setUp() {
        // テスト対象のContactインスタンスをテスト用データで生成
        contact = new Contact("田中太郎", "080-1234-5678", "東京都");
    }

    // -------------------------------
    // コンストラクタの動作確認テスト
    // -------------------------------
    @Test
    public void testConstructor() {
        // Contactインスタンス生成時に設定した値が正しく取得できるか確認
        assertEquals("田中太郎", contact.getName());
        assertEquals("080-1234-5678", contact.getPhoneNumber());
        assertEquals("東京都", contact.getAddress());
    }

    // -------------------------------
    // getter/setterの動作確認テスト
    // -------------------------------
    @Test
    public void testGetterSetter() {
        // setterで値を更新
        contact.setName("鈴木花子");
        contact.setPhoneNumber("090-9876-5432");
        contact.setAddress("大阪府");

        // 更新した値がgetterで正しく取得できるか確認
        assertEquals("鈴木花子", contact.getName());
        assertEquals("090-9876-5432", contact.getPhoneNumber());
        assertEquals("大阪府", contact.getAddress());
    }
}
