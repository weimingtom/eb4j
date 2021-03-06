package io.github.eb4j;

import io.github.eb4j.io.BookInputStream;
import io.github.eb4j.hook.Hook;

/**
 * 検索結果クラス。
 *
 * @author Hisaya FUKUMOTO
 */
public class Result {

    /** 副本 */
    private SubBook _sub = null;
    /** 見出し位置 */
    private long _heading = 0L;
    /** 本文位置 */
    private long _text = 0L;


    /**
     * コンストラクタ。
     *
     * @param sub 副本
     * @param headPage 見出し位置のページ番号
     * @param headOff 見出し位置のページ内オフセット
     * @param textPage 本文位置のページ番号
     * @param textOff 本文位置のページ内オフセット
     */
    protected Result(final SubBook sub, final long headPage, final int headOff,
                     final long textPage, final int textOff) {
        this(sub,
             BookInputStream.getPosition(headPage, headOff),
             BookInputStream.getPosition(textPage, textOff));
    }

    /**
     * コンストラクタ。
     *
     * @param sub 副本
     * @param heading 見出し位置
     * @param textPage 本文位置のページ番号
     * @param textOff 本文位置のページ内オフセット
     */
    protected Result(final SubBook sub, final long heading,
                     final long textPage, final int textOff) {
        this(sub, heading, BookInputStream.getPosition(textPage, textOff));
    }

    /**
     * コンストラクタ。
     *
     * @param sub 副本
     * @param headPage 見出し位置のページ番号
     * @param headOff 見出し位置のページ内オフセット
     * @param text 本文位置
     */
    protected Result(final SubBook sub, final long headPage, final int headOff, final long text) {
        this(sub, BookInputStream.getPosition(headPage, headOff), text);
    }

    /**
     * コンストラクタ。
     *
     * @param sub 副本
     * @param heading 見出し位置
     * @param text 本文位置
     */
    protected Result(final SubBook sub, final long heading, final long text) {
        super();
        _sub = sub;
        _heading = heading;
        _text = text;
    }


    /**
     * 検索結果の見出し位置を返します。
     *
     * @return 副本内の見出しデータ位置
     */
    public long getHeadingPosition() {
        return _heading;
    }

    /**
     * 検索結果の本文位置を返します。
     *
     * @return 副本内の本文データ位置
     */
    public long getTextPosition() {
        return _text;
    }

    /**
     * 指定位置の見出しを返します。
     *
     * @param hook フック (nullの場合はデフォルトのフック)
     * @param <T> type to be return from hook.
     * @return フックによって加工されたオブジェクト
     * @exception EBException ファイル読み込み中にエラーが発生した場合
     */
    public <T> T getHeading(final Hook<T> hook) throws EBException {
        return _sub.getHeading(_heading, hook);
    }

    /**
     * 指定位置の本文を返します。
     *
     * @param hook フック (nullの場合はデフォルトのフック)
     * @param <T> type to be return from hook.
     * @return フックによって加工されたオブジェクト
     * @exception EBException ファイル読み込み中にエラーが発生した場合
     */
    public <T> T getText(final Hook<T> hook) throws EBException {
        return _sub.getText(_text, hook);
    }
}

// end of Result.java
