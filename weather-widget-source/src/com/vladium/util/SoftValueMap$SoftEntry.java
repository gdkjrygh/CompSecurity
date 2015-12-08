// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.vladium.util:
//            SoftValueMap

static class m_next
{

    Object m_key;
    m_next m_next;
    tReference m_softValue;

    tReference(ReferenceQueue referencequeue, Object obj, Object obj1, tReference treference, int i)
    {
        m_key = obj;
        m_softValue = new tReference(obj1, referencequeue, i);
        m_next = treference;
    }
}
