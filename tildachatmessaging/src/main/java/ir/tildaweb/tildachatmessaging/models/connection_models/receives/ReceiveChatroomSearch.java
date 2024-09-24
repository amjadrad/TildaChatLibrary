package ir.tildaweb.tildachatmessaging.models.connection_models.receives;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ir.tildaweb.tildachatmessaging.models.base_models.Chatroom;

public class ReceiveChatroomSearch {

    @SerializedName("chatrooms")
    private List<Chatroom> chatrooms;

    public List<Chatroom> getChatrooms() {
        return chatrooms;
    }

    public void setChatrooms(List<Chatroom> chatrooms) {
        this.chatrooms = chatrooms;
    }

}
