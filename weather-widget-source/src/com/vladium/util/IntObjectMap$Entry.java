// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.Serializable;

// Referenced classes of package com.vladium.util:
//            IntObjectMap

private static final class m_next
    implements Serializable
{

    final int m_key;
    m_next m_next;
    Object m_value;

    (int i, Object obj,  )
    {
        m_key = i;
        m_value = obj;
        m_next = ;
    }
}
