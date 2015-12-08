// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.i18n.filter;


// Referenced classes of package org.bouncycastle.i18n.filter:
//            Filter

public class SQLFilter
    implements Filter
{

    public SQLFilter()
    {
    }

    public String doFilter(String s)
    {
        int i;
        s = new StringBuffer(s);
        i = 0;
_L12:
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_277;
        }
        s.charAt(i);
        JVM INSTR lookupswitch 9: default 108
    //                   10: 259
    //                   13: 241
    //                   34: 133
    //                   39: 115
    //                   45: 169
    //                   47: 187
    //                   59: 223
    //                   61: 151
    //                   92: 205;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L2:
        break MISSING_BLOCK_LABEL_259;
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L13:
        i++;
        if (true) goto _L12; else goto _L11
_L11:
        s.replace(i, i + 1, "\\'");
        i++;
          goto _L13
_L4:
        s.replace(i, i + 1, "\\\"");
        i++;
          goto _L13
_L9:
        s.replace(i, i + 1, "\\=");
        i++;
          goto _L13
_L6:
        s.replace(i, i + 1, "\\-");
        i++;
          goto _L13
_L7:
        s.replace(i, i + 1, "\\/");
        i++;
          goto _L13
_L10:
        s.replace(i, i + 1, "\\\\");
        i++;
          goto _L13
_L8:
        s.replace(i, i + 1, "\\;");
        i++;
          goto _L13
_L3:
        s.replace(i, i + 1, "\\r");
        i++;
          goto _L13
        s.replace(i, i + 1, "\\n");
        i++;
          goto _L13
        return s.toString();
    }

    public String doFilterUrl(String s)
    {
        return doFilter(s);
    }
}
