// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.sym;


// Referenced classes of package org.codehaus.jackson.sym:
//            CharsToNameCanonicalizer

static final class _length
{

    private final int _length;
    private final _length _next;
    private final String _symbol;

    public String find(char ac[], int i, int j)
    {
        _length _llength;
        String s;
        s = _symbol;
        _llength = _next;
_L7:
        int k;
        if (s.length() != j)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        k = 0;
_L5:
        if (s.charAt(k) == ac[i + k]) goto _L2; else goto _L1
_L1:
        if (k == j)
        {
            return s;
        }
        break MISSING_BLOCK_LABEL_72;
_L2:
        int l = k + 1;
        k = l;
        if (l < j)
        {
            break; /* Loop/switch isn't completed */
        }
        k = l;
        if (true) goto _L1; else goto _L3
_L3:
        if (true) goto _L5; else goto _L4
_L4:
        if (_llength == null)
        {
            return null;
        }
        s = _llength.getSymbol();
        _llength = _llength.getNext();
        if (true) goto _L7; else goto _L6
_L6:
    }

    public getNext getNext()
    {
        return _next;
    }

    public String getSymbol()
    {
        return _symbol;
    }

    public int length()
    {
        return _length;
    }

    public (String s,  )
    {
        _symbol = s;
        _next = ;
        int i;
        if ( == null)
        {
            i = 1;
        } else
        {
            i = ._length + 1;
        }
        _length = i;
    }
}
