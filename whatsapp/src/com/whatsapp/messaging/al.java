// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.fieldstats.j;
import com.whatsapp.fieldstats.z;
import com.whatsapp.util.Log;
import com.whatsapp.util.dns.DnsCacheEntrySerializable;
import com.whatsapp.util.dns.f;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.whatsapp.messaging:
//            h, a3, bo, bs, 
//            bx, b0

final class al
{

    private static final String a[];
    private static final String z[];
    private final List b;
    private final int c;
    private final InetSocketAddress d;
    private final boolean e;
    private final SSLSocketFactory f;
    private final Random g;
    private final String h;
    private a3 i;
    private int j;
    private final int k;
    private final List l;
    private final SocketFactory m;

    public al(InetSocketAddress inetsocketaddress, String s, List list, Random random)
    {
        this(inetsocketaddress, s, list, random, e());
    }

    private al(InetSocketAddress inetsocketaddress, String s, List list, Random random, boolean flag)
    {
        int i1;
        i1 = h.a;
        super();
        i = a3.START;
        d = inetsocketaddress;
        h = s;
        g = random;
        l = new ArrayList();
        b = new ArrayList();
        if (list == null) goto _L2; else goto _L1
_L1:
        inetsocketaddress = list.iterator();
_L3:
        if (!inetsocketaddress.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (DnsCacheEntrySerializable)inetsocketaddress.next();
        boolean flag1 = s.isForceOverride();
        if (flag1)
        {
            boolean flag2;
            try
            {
                l.add(s);
            }
            // Misplaced declaration of an exception variable
            catch (InetSocketAddress inetsocketaddress)
            {
                throw inetsocketaddress;
            }
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        b.add(s);
        if (i1 == 0) goto _L3; else goto _L2
_L2:
        f = bo.a();
        m = SocketFactory.getDefault();
        flag2 = random.nextBoolean();
        int j1;
        if (flag2)
        {
            j1 = 443;
        } else
        {
            j1 = 5222;
        }
        try
        {
            k = j1;
        }
        // Misplaced declaration of an exception variable
        catch (InetSocketAddress inetsocketaddress)
        {
            throw inetsocketaddress;
        }
        if (flag2)
        {
            j1 = 5222;
        } else
        {
            j1 = 443;
        }
        c = j1;
        e = flag;
        return;
        inetsocketaddress;
        throw inetsocketaddress;
    }

    private boolean a()
    {
        boolean flag;
        flag = false;
        int i1;
        try
        {
            i1 = bs.a[i.ordinal()];
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        i1;
        JVM INSTR tableswitch 1 9: default 64
    //                   1 98
    //                   2 135
    //                   3 115
    //                   4 135
    //                   5 135
    //                   6 135
    //                   7 137
    //                   8 135
    //                   9 157;
           goto _L1 _L2 _L3 _L4 _L3 _L3 _L3 _L5 _L3 _L6
_L1:
        throw new IllegalStateException((new StringBuilder()).append(z[8]).append(i).toString());
_L2:
        throw new IllegalStateException(z[9]);
_L4:
        flag = ((DnsCacheEntrySerializable)l.get(j)).isSecureSocket();
_L3:
        return flag;
_L5:
        return ((DnsCacheEntrySerializable)b.get(j)).isSecureSocket();
_L6:
        throw new IllegalStateException(z[7]);
    }

    private InetSocketAddress d()
    {
        int i1;
        try
        {
            i1 = bs.a[i.ordinal()];
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        i1;
        JVM INSTR tableswitch 1 9: default 64
    //                   1 97
    //                   2 113
    //                   3 118
    //                   4 138
    //                   5 154
    //                   6 170
    //                   7 251
    //                   8 271
    //                   9 325;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        throw new IllegalStateException((new StringBuilder()).append(z[1]).append(i).toString());
_L2:
        throw new IllegalStateException(z[2]);
_L3:
        return d;
_L4:
        return ((DnsCacheEntrySerializable)l.get(j)).getInetSocketAddress();
_L5:
        return new InetSocketAddress(h, k);
_L6:
        return new InetSocketAddress(h, c);
_L7:
        Object obj = App.aB.a(a[g.nextInt(a.length)]);
        obj = (InetAddress)((List) (obj)).get(g.nextInt(((List) (obj)).size()));
        char c1;
        boolean flag;
        try
        {
            flag = g.nextBoolean();
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        if (flag)
        {
            c1 = '\u01BB';
        } else
        {
            c1 = '\u1466';
        }
        return new InetSocketAddress(((InetAddress) (obj)), c1);
_L8:
        return ((DnsCacheEntrySerializable)b.get(j)).getInetSocketAddress();
_L9:
        List list = App.aB.a(a[g.nextInt(a.length)]);
        return new InetSocketAddress((InetAddress)list.get(g.nextInt(list.size())), 80);
_L10:
        throw new IllegalStateException(z[0]);
    }

    public static boolean e()
    {
        String s = App.au.getSharedPreferences(z[4], 0).getString(z[5], null);
        return TextUtils.equals(z[6], s);
    }

    public OutputStream a(Socket socket)
    {
label0:
        {
            try
            {
                if (i != a3.HTTP)
                {
                    break label0;
                }
                socket = new bx(socket.getOutputStream());
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                throw socket;
            }
            return socket;
        }
        return socket.getOutputStream();
    }

    public Socket a(int i1)
    {
        Socket socket;
        Socket socket1;
        InetSocketAddress inetsocketaddress;
        boolean flag;
        try
        {
            if (i == a3.HTTP)
            {
                com.whatsapp.fieldstats.z.a(App.au.getApplicationContext(), j.PSEUDO_HTTP_CONNECTION_ATTEMPT, Integer.valueOf(1));
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        inetsocketaddress = d();
        flag = a();
        Log.b(z[3], null, new Object[] {
            inetsocketaddress, Boolean.valueOf(flag)
        });
        socket1 = m.createSocket();
        socket1.connect(inetsocketaddress, i1);
        socket = socket1;
        if (flag)
        {
            socket = f.createSocket(socket1, inetsocketaddress.getHostName(), inetsocketaddress.getPort(), true);
            ((SSLSocket)socket).startHandshake();
        }
        return socket;
    }

    public InputStream b(Socket socket)
    {
label0:
        {
            try
            {
                if (i != a3.HTTP)
                {
                    break label0;
                }
                socket = new b0(socket.getInputStream());
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                throw socket;
            }
            return socket;
        }
        return socket.getInputStream();
    }

    public boolean b()
    {
        boolean flag = false;
        int i1 = h.a;
        Object obj;
        a3 a3_1;
        int j1;
        int k1;
        boolean flag1;
        try
        {
            j1 = bs.a[i.ordinal()];
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        j1;
        JVM INSTR tableswitch 1 8: default 68
    //                   1 88
    //                   2 171
    //                   3 182
    //                   4 252
    //                   5 263
    //                   6 274
    //                   7 326
    //                   8 380;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        Object obj1;
        try
        {
            obj = i;
            a3_1 = a3.END;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (obj != a3_1)
        {
            flag = true;
        }
        return flag;
_L2:
        obj = d;
        if (obj == null) goto _L11; else goto _L10
_L10:
        i = a3.DEBUG_CHAT_HOST;
        if (i1 == 0) goto _L1; else goto _L11
_L11:
        flag1 = l.isEmpty();
        if (flag1) goto _L13; else goto _L12
_L12:
        i = a3.OVERRIDES;
        if (i1 == 0) goto _L1; else goto _L13
_L13:
        flag1 = TextUtils.isEmpty(h);
        if (flag1) goto _L15; else goto _L14
_L14:
        i = a3.IP_OVERRIDE_PORT_1;
        if (i1 == 0) goto _L1; else goto _L15
_L15:
        i = a3.PRIMARY;
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        i = a3.END;
        if (i1 == 0) goto _L1; else goto _L4
_L4:
        j = j + 1;
        j1 = j;
        k1 = l.size();
        if (j1 < k1) goto _L1; else goto _L16
_L16:
        flag1 = TextUtils.isEmpty(h);
        if (!flag1) goto _L18; else goto _L17
_L17:
        i = a3.PRIMARY;
        if (i1 == 0) goto _L1; else goto _L18
_L18:
        i = a3.IP_OVERRIDE_PORT_1;
        if (i1 == 0) goto _L1; else goto _L5
_L5:
        i = a3.IP_OVERRIDE_PORT_2;
        if (i1 == 0) goto _L1; else goto _L6
_L6:
        i = a3.PRIMARY;
        if (i1 == 0) goto _L1; else goto _L7
_L7:
        flag1 = b.isEmpty();
        if (!flag1) goto _L20; else goto _L19
_L19:
        if (!e) goto _L22; else goto _L21
_L21:
        obj1 = a3.HTTP;
_L26:
        try
        {
            i = ((a3) (obj1));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        if (i1 == 0) goto _L1; else goto _L20
_L20:
        i = a3.FALLBACKS;
        j = 0;
        if (i1 == 0) goto _L1; else goto _L8
_L8:
        j = j + 1;
        j1 = j;
        k1 = b.size();
        if (j1 < k1) goto _L1; else goto _L23
_L23:
        if (!e) goto _L25; else goto _L24
_L24:
        obj1 = a3.HTTP;
_L27:
        try
        {
            i = ((a3) (obj1));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (i1 == 0) goto _L1; else goto _L9
_L9:
        i = a3.END;
          goto _L1
_L22:
        obj1 = a3.END;
          goto _L26
_L25:
        obj1 = a3.END;
          goto _L27
    }

    public void c()
    {
        try
        {
            if (i == a3.HTTP)
            {
                com.whatsapp.fieldstats.z.a(App.au.getApplicationContext(), j.PSEUDO_HTTP_CONNECTION_FAILURE, Integer.valueOf(1));
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public void f()
    {
        try
        {
            if (i == a3.HTTP)
            {
                com.whatsapp.fieldstats.z.a(App.au.getApplicationContext(), j.PSEUDO_HTTP_CONNECTION_SUCCESS, Integer.valueOf(1));
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int i1;
        as = new String[10];
        obj = "L!/k\030{`3`\003})$s\022/!%a\005j32%\007n35%\022a$";
        byte0 = -1;
        as1 = as;
        i1 = 0;
_L10:
        int j1;
        int k1;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L7:
        if (k1 <= j1)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "Z.3`\024`'/l\rj$av\003n4$%";
                i1 = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "B52qWl!-iWb/7`#`\016$}\003/&(w\004{";
                i1 = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "l//k\022l4(j\031P3$t\002j.\"`X{28Z\024`./`\024{odvW'-$q\037`$~%Rmi";
                i1 = 3;
                as1 = as;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                as1 = as;
                obj = "l/,+\000g!5v\026\1770\036u\005j&$w\022a#$v";
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                obj = "l#";
                byte0 = 4;
                i1 = 5;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                as1 = as;
                obj = "6q";
                byte0 = 5;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "L!/k\030{`3`\003})$s\022/3.f\034j4au\026|4a`\031k";
                byte0 = 6;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "Z.3`\024`'/l\rj$av\003n4$%";
                byte0 = 7;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "B52qWl!-iWb/7`#`\016$}\003/&(w\004{";
                byte0 = 8;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                z = as;
                as = new String[16];
                obj = "jqor\037n42d\007\177n/`\003!";
                byte0 = 9;
                as1 = as;
                i1 = 0;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                obj = "jror\037n42d\007\177n/`\003!";
                byte0 = 10;
                i1 = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                obj = "jsor\037n42d\007\177n/`\003!";
                byte0 = 11;
                i1 = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                obj = "jtor\037n42d\007\177n/`\003!";
                byte0 = 12;
                i1 = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "juor\037n42d\007\177n/`\003!";
                byte0 = 13;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                obj = "jvor\037n42d\007\177n/`\003!";
                byte0 = 14;
                i1 = 5;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "jwor\037n42d\007\177n/`\003!";
                byte0 = 15;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "jxor\037n42d\007\177n/`\003!";
                byte0 = 16;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "jyor\037n42d\007\177n/`\003!";
                byte0 = 17;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "jqq+\000g!5v\026\1770ok\022{n";
                byte0 = 18;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "jqp+\000g!5v\026\1770ok\022{n";
                byte0 = 19;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "jqs+\000g!5v\026\1770ok\022{n";
                byte0 = 20;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "jqr+\000g!5v\026\1770ok\022{n";
                byte0 = 21;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "jqu+\000g!5v\026\1770ok\022{n";
                byte0 = 22;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "jqt+\000g!5v\026\1770ok\022{n";
                byte0 = 23;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "jqw+\000g!5v\026\1770ok\022{n";
                byte0 = 24;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 404
    //                   0 427
    //                   1 434
    //                   2 441
    //                   3 448;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_448;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 119;
_L8:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 15;
          goto _L8
_L3:
        byte1 = 64;
          goto _L8
_L4:
        byte1 = 65;
          goto _L8
        byte1 = 5;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        a = as;
    }
}
