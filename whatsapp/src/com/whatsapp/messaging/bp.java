// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import com.whatsapp.protocol.ba;
import com.whatsapp.protocol.bj;
import com.whatsapp.protocol.bq;

// Referenced classes of package com.whatsapp.messaging:
//            as

class bp
    implements bq
{

    final as a;

    bp(as as)
    {
        a = as;
        super();
    }

    public bj a(byte abyte0[], byte abyte1[])
    {
        return new ba(abyte0, abyte1);
    }
}
