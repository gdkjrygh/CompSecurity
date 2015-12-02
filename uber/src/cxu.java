// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Base64;
import com.ubercab.chat.model.ConversationThread;
import com.ubercab.chat.model.Inbox;
import com.ubercab.chat.model.Message;
import com.ubercab.chat.model.Payload;
import com.ubercab.chat.model.SendStatus;

public final class cxu
{

    final cya a;
    private final cxx b;
    private final Inbox c;
    private final cxz d;
    private String e;
    private final iis f;
    private final iis g;

    public cxu(Context context, hjo hjo)
    {
        this(new cxx(new cxy(context)), new Inbox(), new cxz(cyd.a(hjo)));
    }

    private cxu(cxx cxx1, Inbox inbox, cxz cxz1)
    {
        a = new _cls1();
        f = iis.m();
        g = iis.m();
        b = cxx1;
        c = inbox;
        d = cxz1;
        d.a(a);
        b.a();
    }

    static Inbox a(cxu cxu1)
    {
        return cxu1.c;
    }

    private void a(ConversationThread conversationthread)
    {
        gjz.a(conversationthread.getThreadId());
        d.a(conversationthread.getHighWaterMark(), conversationthread.getThreadId()).a(ico.a()).b(new _cls4(conversationthread));
    }

    private void a(Message message)
    {
        boolean flag = gjx.a(e, message.getSenderId());
        message.setIsOutgoing(flag);
        message.setIsRead(flag);
        String s = message.getMessageId();
        if (s != null)
        {
            message.getPayload().setId(s);
            message.getPayload().setLocalPath(b.b(s));
        }
    }

    private void a(Message message, String s, byte abyte0[])
    {
        s = c.getThread(message.getThreadId(), s);
        s.addPendingOutgoingMessage(message);
        d.a(message, Base64.encodeToString(abyte0, 0)).a(ico.a()).b(new _cls5(s));
    }

    static void a(cxu cxu1, ConversationThread conversationthread)
    {
        cxu1.a(conversationthread);
    }

    static void a(cxu cxu1, Message message)
    {
        cxu1.a(message);
    }

    static void a(cxu cxu1, Message message, String s, byte abyte0[])
    {
        cxu1.a(message, s, abyte0);
    }

    static void a(cxu cxu1, String s, ConversationThread conversationthread)
    {
        cxu1.a(s, conversationthread);
    }

    static void a(cxu cxu1, String s, ConversationThread conversationthread, byte abyte0[])
    {
        cxu1.a(s, conversationthread, abyte0);
    }

    private void a(String s, ConversationThread conversationthread)
    {
        d.a(s, conversationthread.getThreadId()).a(ico.a()).b(new _cls3(conversationthread, s));
    }

    private void a(String s, ConversationThread conversationthread, byte abyte0[])
    {
        b.a(s, abyte0).a(ico.a()).b(new _cls6(conversationthread));
    }

    static iis b(cxu cxu1)
    {
        return cxu1.g;
    }

    static iis c(cxu cxu1)
    {
        return cxu1.f;
    }

    public final ConversationThread a(String s, String s1)
    {
        return c.getOrCreateConversationThread(s, s1);
    }

    public final grr a()
    {
        return d;
    }

    public final void a(Payload payload, String s, String s1)
    {
        ConversationThread conversationthread = c.getThread(s1, s);
        String s2 = payload.getId();
        g.a(SendStatus.create(3, s1, s));
        payload = Message.create(s2, "voice", payload, e, conversationthread.getThreadId(), conversationthread.getTripId());
        b.c(payload.getClientMessageId()).a(ico.a()).b(new _cls2(s1, s, payload));
    }

    public final void a(String s)
    {
        e = s;
    }

    public final ica b()
    {
        return f.c();
    }

    public final String c()
    {
        return e;
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls2 {}

}
