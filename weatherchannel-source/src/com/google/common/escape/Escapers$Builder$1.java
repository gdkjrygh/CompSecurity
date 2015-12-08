// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.escape;

import java.util.Map;

// Referenced classes of package com.google.common.escape:
//            ArrayBasedCharEscaper, Escapers

class replacementChars extends ArrayBasedCharEscaper
{

    private final char replacementChars[];
    final replacementChars this$0;

    protected char[] escapeUnsafe(char c)
    {
        return replacementChars;
    }

    er(Map map, char c, char c1)
    {
        this$0 = this._cls0.this;
        super(map, c, c1);
        if (cess._mth100(this._cls0.this) != null)
        {
            er = cess._mth100(this._cls0.this).toCharArray();
        } else
        {
            er = null;
        }
        replacementChars = replacementChars.this;
    }
}
