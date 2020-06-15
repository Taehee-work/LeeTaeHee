package kr.or.test;

public class Chatting {

	public static void main(String[] args) {
		Chatting chat = new Chatting();
		chat.startChat("user33");
	}
	void startChat(String chatId) {
		String nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
					break;
				}//end while
			}//end start()
		};//end chat()
		chat.start();
	}
	
	class Chat{
		void start() {}
		void sendMessage(String message) {
			System.out.println(message);
		}
	}
}

