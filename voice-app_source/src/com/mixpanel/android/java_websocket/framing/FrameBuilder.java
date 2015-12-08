// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.framing;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import java.nio.ByteBuffer;

// Referenced classes of package com.mixpanel.android.java_websocket.framing:
//            Framedata

public interface FrameBuilder
    extends Framedata
{

    public abstract void setFin(boolean flag);

    public abstract void setOptcode(Framedata.Opcode opcode);

    public abstract void setPayload(ByteBuffer bytebuffer)
        throws InvalidDataException;

    public abstract void setTransferemasked(boolean flag);
}
