class InputStreamDemo{
	public static void main(String[] args) {
		FileOutputStream fos=new FileOutputStream("file path here");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ObjectName);
		fos.close();
		oos.close();
		FileInputStream fis=new FileInputStream("Same file");
		ObjectInputStream ois = new ObjectInputStream(fis);
		className objectName=(className)ois.readObject();
		//then call display method of the class that you made
	}
}