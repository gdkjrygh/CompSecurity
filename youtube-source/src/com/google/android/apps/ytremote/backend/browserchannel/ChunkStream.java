// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import android.util.Log;
import com.google.android.apps.ytremote.logic.exception.NotFoundException;
import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            i, d, e, UnexpectedReponseCodeException

class ChunkStream
    implements i
{

    private static final String a = com/google/android/apps/ytremote/backend/browserchannel/ChunkStream.getCanonicalName();
    private State b;
    private int c;
    private final CharArrayWriter d = new CharArrayWriter();
    private final CharArrayWriter e = new CharArrayWriter();
    private e f;

    public ChunkStream()
    {
        b = State.ST_CHUNK_LENGTH;
    }

    private int a(char ac[], int j, int k)
    {
        for (int l = 0; l < k; l++)
        {
            if (ac[j + l] == '\n')
            {
                d.write(ac, j, l);
                ac = d.toString();
                try
                {
                    c = Integer.parseInt(ac, 10);
                }
                catch (NumberFormatException numberformatexception)
                {
                    Log.e(a, (new StringBuilder("Error parsing chunk length: ")).append(ac).toString(), numberformatexception);
                    b = State.ST_CHUNK_LENGTH;
                    d.reset();
                    return l + 1;
                }
                b = State.ST_CHUNK_BODY;
                d.reset();
                return l + 1;
            }
        }

        d.write(ac, j, k);
        return k;
    }

    public final int a(char ac[])
    {
        int j;
        int i1;
        int j1;
        j1 = ac.length;
        j = j1;
        i1 = 0;
_L2:
        int k;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        switch (d.a[b.ordinal()])
        {
        default:
            k = j;
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_75;
        }
_L3:
        i1 += k;
        j -= k;
        if (true) goto _L2; else goto _L1
_L1:
        k = a(ac, i1, j);
          goto _L3
        int l;
        if (j >= c)
        {
            l = c;
            b = State.ST_CHUNK_LENGTH;
        } else
        {
            l = j;
        }
        e.write(ac, i1, l);
        c = c - l;
        k = l;
        if (c == 0)
        {
            if (f != null)
            {
                f.a(e.toString());
            }
            e.reset();
            k = l;
        }
          goto _L3
        return j1 - j;
    }

    public final void a(int j)
    {
        if (j == 404)
        {
            throw new NotFoundException((new StringBuilder("Unexpected response code: ")).append(j).toString());
        }
        if (j != 200)
        {
            throw new UnexpectedReponseCodeException(j);
        } else
        {
            return;
        }
    }

    public final void a(e e1)
    {
        f = e1;
    }

    public final void a(byte abyte0[], int j, int k)
    {
        try
        {
            abyte0 = (new String(abyte0, j, k, "UTF-8")).toCharArray();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalStateException("This application needs UTF-8 support in order to run");
        }
        a(((char []) (abyte0)));
    }

    protected void finalize()
    {
        if (State.ST_CHUNK_BODY == b)
        {
            Log.w(a, "Lost partial chunk");
        }
    }


    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State ST_CHUNK_BODY;
        public static final State ST_CHUNK_LENGTH;
        public static final State ST_ERROR;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/android/apps/ytremote/backend/browserchannel/ChunkStream$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            ST_CHUNK_LENGTH = new State("ST_CHUNK_LENGTH", 0);
            ST_CHUNK_BODY = new State("ST_CHUNK_BODY", 1);
            ST_ERROR = new State("ST_ERROR", 2);
            $VALUES = (new State[] {
                ST_CHUNK_LENGTH, ST_CHUNK_BODY, ST_ERROR
            });
        }

        private State(String s, int j)
        {
            super(s, j);
        }
    }

}
