// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            TreeMultiset

class actEntry extends actEntry
{

    final TreeMultiset this$0;
    final lNode val$baseEntry;

    public int getCount()
    {
        int j = val$baseEntry.getCount();
        int i = j;
        if (j == 0)
        {
            i = count(getElement());
        }
        return i;
    }

    public Object getElement()
    {
        return val$baseEntry.getElement();
    }

    lNode()
    {
        this$0 = final_treemultiset;
        val$baseEntry = lNode.this;
        super();
    }
}
