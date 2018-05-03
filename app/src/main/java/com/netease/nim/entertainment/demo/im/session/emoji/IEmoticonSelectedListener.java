package com.netease.nim.entertainment.demo.im.session.emoji;

public interface IEmoticonSelectedListener {
    void onEmojiSelected(String key);

    void onStickerSelected(String categoryName, String stickerName);
}
