// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.whatsapp:
//            qh, App, uy, ir, 
//            dm, afs, a1r, a1h

public class gc
{

    private static final String z[];
    int a;
    final ir b;
    LinkedList c;
    final a1h d;
    final URL e;
    final int f;
    final int g;

    public gc(URL url, ir ir1, int i, int j, a1h a1h1)
    {
        c = new LinkedList();
        e = url;
        b = ir1;
        f = i;
        g = j;
        d = a1h1;
    }

    public gc(URL url, File file, int i, int j, a1h a1h1)
    {
        this(url, ((ir) (new qh(file))), 0, j, a1h1);
    }

    public gc(URL url, File file, int i, a1h a1h1)
    {
        this(url, file, 0, i, a1h1);
    }

    static void a(OutputStream outputstream, String s)
    {
        int i;
        i = App.am;
        s = new StringReader(s);
_L2:
        int j = s.read();
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        outputstream.write((char)j);
        if (i == 0) goto _L2; else goto _L1
_L1:
        outputstream.flush();
        return;
        s;
        Log.a(s);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public int a()
    {
        return a;
    }

    public void a(String s, String s1)
    {
        c.add(new uy(this, s, s1));
    }

    public boolean b()
    {
        Object obj;
        long l;
        int i = App.am;
        obj = new StringBuilder();
        Object obj1 = b.a().replace(z[4], "");
        Iterator iterator;
        long l1;
        long l2;
        try
        {
            ((StringBuilder) (obj)).append(z[1]).append(z[15]).append(((String) (obj1))).append(z[8]).append(z[7]);
            if (f != 0)
            {
                ((StringBuilder) (obj)).append((new StringBuilder()).append(z[6]).append(f).append(z[9]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        ((StringBuilder) (obj)).append(z[16]);
        obj = ((StringBuilder) (obj)).toString();
        obj1 = new StringBuilder();
        iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj2 = (uy)iterator.next();
            String s = ((uy) (obj2)).c.replace(z[2], "");
            obj2 = ((uy) (obj2)).a.replace(z[11], "");
            ((StringBuilder) (obj1)).append(z[17]).append(z[19]).append(z[5]).append(s).append(z[18]).append(((String) (obj2)));
        } while (i == 0);
        ((StringBuilder) (obj1)).append(z[13]).append(z[12]).append(z[0]);
        obj1 = ((StringBuilder) (obj1)).toString();
        try
        {
            if (b.c() < 0L)
            {
                break MISSING_BLOCK_LABEL_430;
            }
            l = ((String) (obj)).length();
            l1 = b.c();
            l2 = ((String) (obj1)).length();
            i = f;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        l = (l + l1 + l2) - (long)i;
_L1:
        obj = new dm(this, new afs(this, ((String) (obj)), ((String) (obj1))), l);
        obj1 = a1r.b(e.toString());
        ((a1r) (obj1)).a(((org.apache.http.HttpEntity) (obj)));
        ((a1r) (obj1)).a(z[14], z[10]);
        try
        {
            obj = ((a1r) (obj1)).a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (obj == null)
        {
            try
            {
                Log.w(z[3]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return false;
        }
        break MISSING_BLOCK_LABEL_444;
        l = -1L;
          goto _L1
label0:
        {
            boolean flag;
            try
            {
                a = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
                flag = Thread.currentThread().isInterrupted();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (flag)
            {
                return false;
            }
            try
            {
                if (d == null)
                {
                    break label0;
                }
                d.a(EntityUtils.toString(((HttpResponse) (obj)).getEntity()));
            }
            catch (SocketTimeoutException sockettimeoutexception)
            {
                throw sockettimeoutexception;
            }
            return true;
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[20];
        obj = "H*f\021";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "H*\023B<?^f\021";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "h\r";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\003n\007~3\025k\004z\"Ji\004i#\026w\004u5\0";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "h\r";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "h\r(t(\021b\005ok!n\030k)\026n\037r)\013=K})\027jF\177'\021fP;(\004j\016&d";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "&h\005o#\013sFI'\013`\016!f\007~\037~5E";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                obj = "&h\005o#\013sFO?\025bQ;'\025w\007r%\004s\002t(Jh\bo#\021*\030o4\000f\006\026L";
                byte0 = 6;
                i = 7;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "G\na";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "H-D1Ko";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\br\007o/\025f\031oi\003h\031vk\001f\037z}\007h\036u\"\004u\022&><}1B";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "h\r";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\035^\021A\037";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "h\rF6";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "&h\005o#\013sFO?\025b";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "&h\005o#\013sF_/\026w\004h/\021n\004u|Ea\004i+Hc\no'^'\005z+\000:I}/\tbI  \fk\016u'\bbV9";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "h\r";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "h\rF6";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "G\na\026L";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\035^\021A\037";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 520
    //                   0 543
    //                   1 550
    //                   2 557
    //                   3 564;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_564;
_L3:
        byte byte1 = 70;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 101;
          goto _L9
_L5:
        byte1 = 7;
          goto _L9
_L6:
        byte1 = 107;
          goto _L9
        byte1 = 27;
          goto _L9
    }
}
