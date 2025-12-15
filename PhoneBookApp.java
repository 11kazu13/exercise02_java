package exercise02;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookApp {

	public static void main(String[] args) {
        // 連絡先(Contact)を格納するArrayListを作成（電話帳）
    	ArrayList<Contact> contacts = new ArrayList<Contact>();

        // ユーザーから入力を受け取るためのScannerを作成
    	Scanner sc = new Scanner(System.in);

        // 初期データとして2件の連絡先を作成
    	Contact contact1 = new Contact("井納", "090-7912-2852", "東京");
    	Contact contact2 = new Contact("中谷", "090-4544-3432", "大阪");

        // 電話帳に連絡先を追加
    	contacts.add(contact1);
    	contacts.add(contact2);

        // 電話帳に登録されている全連絡先を一覧表示
    	for (Contact c : contacts) {
    		c.showContact();
    	}

        // ユーザーに検索する名前を入力させる
    	System.out.println("検索したい名前を入力してください > ");
    	String target = sc.nextLine();
        
    	for (Contact c : contacts) {
    		
    		String name = c.getName();
    		
    		if (name.equals(target)) {
    			c.showContact();
    			break;
    		} else {
    			System.out.println("該当なし");
    		}
    	}

        // Scannerを閉じてリソースを解放
    	sc.close();
    }
}
