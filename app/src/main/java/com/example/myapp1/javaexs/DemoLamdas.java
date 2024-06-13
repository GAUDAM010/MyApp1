package com.example.myapp1.javaexs;

public class DemoLamdas {

    // Define the IMessage interface with a sendMessage method
    interface IMessage {
        void sendMessage();
    }

    // Define the OnClickListener interface with an onClick method
    interface OnClickListener {
        void onClick(int value);
    }

    // Implement the IMessage interface
    static class MessageImpl implements IMessage {
        @Override
        public void sendMessage() {
            System.out.println("sending message from MessageImpl");
        }
    }

    // Implement the OnClickListener interface
    static class OnClickImpl implements OnClickListener {
        @Override
        public void onClick(int value) {
            System.out.println("handling click from OnClickImpl, value: " + value);
        }
    }

    public static void main(String[] args) {
        // life before lambdas
        MessageImpl message = new MessageImpl();
        message.sendMessage();

        OnClickImpl onClickimpl = new OnClickImpl();
        onClickimpl.onClick(12);

        // life after lambdas
        IMessage iMessage = () -> {
            System.out.println("sending message from lambda");
        };
        iMessage.sendMessage();

        OnClickListener onClickListener = (v) -> {
            System.out.println("handling lambda click, value: " + v);
        };
        onClickListener.onClick(121);
    }
}
