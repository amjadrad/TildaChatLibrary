package ir.tildaweb.tildachatmessaging.interfaces;


import ir.tildaweb.tildachatmessaging.adapter.AdapterPrivateChatMessages;
import ir.tildaweb.tildachatmessaging.models.base_models.Message;

public interface IChatUtils {

    void onCopy();

    void onReply(Message message);

    void onEdit(Message message);

    void onDelete(Message message);

    void onShowPurchasableSecurePicture(Message message);

    void onLoadMoreForSearch(int searchMessageId, AdapterPrivateChatMessages.SearchType searchType);

    void onLoadMoreForSearchFinish();

    void onMessageSeen(int messageId);

    void onMessageItemUserInfoClick(Message message);

    void onMessageTextLinkClick(String link);
}
