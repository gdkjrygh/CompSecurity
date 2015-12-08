// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import com.mixpanel.android.java_websocket.exceptions.NotSendableException;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            EditorConnection

private class <init> extends OutputStream
{

    final EditorConnection this$0;

    public void close()
        throws ion
    {
        try
        {
            EditorConnection.access$2(EditorConnection.this).entedFrame(com.mixpanel.android.java_websocket.framing., EditorConnection.access$3(), true);
            return;
        }
        catch (WebsocketNotConnectedException websocketnotconnectedexception)
        {
            throw new ion(EditorConnection.this, websocketnotconnectedexception);
        }
        catch (NotSendableException notsendableexception)
        {
            throw new ion(EditorConnection.this, notsendableexception);
        }
    }

    public void write(int i)
        throws ion
    {
        write(new byte[] {
            (byte)i
        }, 0, 1);
    }

    public void write(byte abyte0[])
        throws ion
    {
        write(abyte0, 0, abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
        throws ion
    {
        abyte0 = ByteBuffer.wrap(abyte0, i, j);
        try
        {
            EditorConnection.access$2(EditorConnection.this).entedFrame(com.mixpanel.android.java_websocket.framing., abyte0, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ion(EditorConnection.this, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ion(EditorConnection.this, abyte0);
        }
    }

    private ption()
    {
        this$0 = EditorConnection.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
