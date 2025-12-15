package exercise02;

public class Contact {
    // 名前を保持するフィールド
	private String name;
    
    // 電話番号を保持するフィールド
    private String phoneNumber;
	
    // 住所を保持するフィールド
    private String address;

    // 引数なしコンストラクタ（初期値を"未設定"に設定）
    public Contact() {
    	this.name = "未設定";
    	this.phoneNumber = "未設定";
    	this.address = "未設定";
    }

    // 引数ありコンストラクタ（名前・電話番号・住所を設定してインスタンス生成）
    public Contact(String name, String phoneNumber, String address) {
    	this.name = name;
    	this.phoneNumber = phoneNumber;
    	this.address = address;
    }

    // 連絡先情報をコンソールに表示するメソッド
    public void showContact() {
        System.out.printf("名前：%s, 電話番号：%s, 住所：%s\n", this.name, this.phoneNumber, this.address);
    }

    // 以下はカプセル化のためのgetter/setterメソッド
    // ------------------------------------------------------

    // 名前を取得するgetter
    public String getName() {
    	return this.name;
    }

    // 名前を設定するsetter
    public void setName(String name) {
    	this.name = name;
    }

    // 電話番号を取得するgetter
    public String getPhoneNumber() {
    	return this.phoneNumber;
    }

    // 電話番号を設定するsetter
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }

    // 住所を取得するgetter
    public String getAddress() {
    	return this.address;
    }

    // 住所を設定するsetter
    public void setAddress(String address) {
    	this.address = address;
    }
}
