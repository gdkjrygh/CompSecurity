// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;

abstract class LineBuffer
{

    private StringBuilder line;
    private boolean sawReturn;

    LineBuffer()
    {
        line = new StringBuilder();
    }

    private boolean finishLine(boolean flag)
        throws IOException
    {
        String s1 = line.toString();
        String s;
        if (sawReturn)
        {
            if (flag)
            {
                s = "\r\n";
            } else
            {
                s = "\r";
            }
        } else
        if (flag)
        {
            s = "\n";
        } else
        {
            s = "";
        }
        handleLine(s1, s);
        line = new StringBuilder();
        sawReturn = false;
        return flag;
    }

    protected void add(char ac[], int i, int j)
        throws IOException
    {
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        l = i;
        k = l;
        if (sawReturn)
        {
            k = l;
            if (j > 0)
            {
                boolean flag;
                if (ac[l] == '\n')
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                k = l;
                if (finishLine(flag))
                {
                    k = l + 1;
                }
            }
        }
        j1 = k;
        k1 = i + j;
        if (k >= k1)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        i1 = k;
        l = j1;
        switch (ac[k])
        {
        default:
            l = j1;
            i1 = k;
            break;

        case 10: // '\n'
            break MISSING_BLOCK_LABEL_229;

        case 11: // '\013'
        case 12: // '\f'
            break;

        case 13: // '\r'
            break; /* Loop/switch isn't completed */
        }
_L4:
        k = i1 + 1;
        j1 = l;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_62;
_L1:
        line.append(ac, j1, k - j1);
        sawReturn = true;
        l = k;
        if (k + 1 < k1)
        {
            boolean flag1;
            if (ac[k + 1] == '\n')
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            l = k;
            if (finishLine(flag1))
            {
                l = k + 1;
            }
        }
        k = l + 1;
        i1 = l;
        l = k;
        continue; /* Loop/switch isn't completed */
        line.append(ac, j1, k - j1);
        finishLine(true);
        l = k + 1;
        i1 = k;
        if (true) goto _L4; else goto _L3
_L3:
        line.append(ac, j1, (i + j) - j1);
        return;
    }

    protected void finish()
        throws IOException
    {
        if (sawReturn || line.length() > 0)
        {
            finishLine(false);
        }
    }

    protected abstract void handleLine(String s, String s1)
        throws IOException;
}
