// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            afn

class ak3
    implements Comparator
{

    final afn a;

    ak3(afn afn)
    {
        a = afn;
        super();
    }

    public int a(EmojiPicker.EmojiWeight emojiweight, EmojiPicker.EmojiWeight emojiweight1)
    {
        return Float.compare(emojiweight1.weight, emojiweight.weight);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((EmojiPicker.EmojiWeight)obj, (EmojiPicker.EmojiWeight)obj1);
    }
}
