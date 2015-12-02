// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes;


// Referenced classes of package com.googlecode.mp4parser.boxes:
//            AbstractSampleEncryptionBox

public class encrypted
{

    public int clear;
    public long encrypted;
    final encrypted this$1;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (encrypted)obj;
            if (clear != ((clear) (obj)).clear)
            {
                return false;
            }
            if (encrypted != ((encrypted) (obj)).encrypted)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return clear * 31 + (int)(encrypted ^ encrypted >>> 32);
    }

    public String toString()
    {
        return (new StringBuilder("clr:")).append(clear).append(" enc:").append(encrypted).toString();
    }

    public (int i, long l)
    {
        this$1 = this._cls1.this;
        super();
        clear = i;
        encrypted = l;
    }
}
