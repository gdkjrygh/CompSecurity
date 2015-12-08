// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.d.a;

import android.util.Pair;
import com.google.android.exoplayer.ag;
import com.google.android.exoplayer.ah;
import com.google.android.exoplayer.b;
import com.google.android.exoplayer.e.a;
import com.google.android.exoplayer.upstream.p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer.d.a:
//            g, j, d, b, 
//            a, c, e, i, 
//            k, h

public final class f
{

    private static final byte a[] = {
        0, 0, 0, 1
    };
    private static final byte b[] = {
        -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 
        108, 66, 124, 100, -115, -12
    };
    private static final Set c;
    private static final Set d;
    private final boolean e;
    private final g f;
    private final Stack g;
    private final Stack h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private g n;
    private g o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private final HashMap v;
    private h w;
    private i x;
    private e y;
    private k z;

    public f()
    {
        this(false);
    }

    private f(boolean flag)
    {
        e = false;
        i = 0;
        f = new g(8);
        g = new Stack();
        h = new Stack();
        v = new HashMap();
    }

    private static Pair a(g g1)
    {
        g1.a(12);
        int i2 = g1.g();
        Object obj = null;
        j aj[] = new j[i2];
        int i1 = 0;
        while (i1 < i2) 
        {
            int k2 = g1.c();
            int l2 = g1.g();
            int k1 = g1.g();
            if (k1 == 0x61766331 || k1 == 0x656e6376)
            {
                g1.a(k2 + 8);
                g1.b(24);
                int i3 = g1.e();
                int j3 = g1.e();
                g1.b(50);
                k1 = g1.c();
                j j1 = null;
                Object obj1;
                for (obj = null; k1 - k2 < l2; obj = obj1)
                {
                    g1.a(k1);
                    int l1 = g1.c();
                    int k3 = g1.g();
                    int l3 = g1.g();
                    j j2;
                    if (l3 == 0x61766343)
                    {
                        g1.a(l1 + 8 + 4);
                        if ((g1.d() & 3) + 1 != 4)
                        {
                            throw new IllegalStateException();
                        }
                        obj = new ArrayList();
                        l3 = g1.d();
                        for (l1 = 0; l1 < (l3 & 0x1f); l1++)
                        {
                            ((List) (obj)).add(b(g1));
                        }

                        l3 = g1.d();
                        l1 = 0;
                        do
                        {
                            j2 = j1;
                            obj1 = obj;
                            if (l1 >= l3)
                            {
                                break;
                            }
                            ((List) (obj)).add(b(g1));
                            l1++;
                        } while (true);
                    } else
                    {
                        j2 = j1;
                        obj1 = obj;
                        if (l3 == 0x73696e66)
                        {
                            j2 = b(g1, l1, k3);
                            obj1 = obj;
                        }
                    }
                    k1 += k3;
                    j1 = j2;
                }

                Pair pair = Pair.create(ag.a("video/avc", -1, i3, j3, ((List) (obj))), j1);
                obj = (ag)pair.first;
                aj[i1] = (j)pair.second;
            } else
            if (k1 == 0x6d703461 || k1 == 0x656e6361)
            {
                Pair pair1 = a(g1, k2, l2);
                obj = (ag)pair1.first;
                aj[i1] = (j)pair1.second;
            }
            g1.a(k2 + l2);
            i1++;
        }
        return Pair.create(obj, aj);
    }

    private static Pair a(g g1, int i1, int j1)
    {
        g1.a(i1 + 8);
        g1.b(16);
        int k1 = g1.e();
        int i3 = g1.e();
        g1.b(4);
        int l1 = g1.i();
        byte abyte0[] = null;
        j j2 = null;
        int i2 = g1.c();
        while (i2 - i1 < j1) 
        {
            g1.a(i2);
            int k2 = g1.c();
            int j3 = g1.g();
            int k3 = g1.g();
            if (k3 == 0x65736473)
            {
                g1.a(k2 + 8 + 4);
                g1.b(1);
                for (k1 = g1.d(); k1 > 127; k1 = g1.d()) { }
                g1.b(2);
                k1 = g1.d();
                if ((k1 & 0x80) != 0)
                {
                    g1.b(2);
                }
                if ((k1 & 0x40) != 0)
                {
                    g1.b(g1.e());
                }
                if ((k1 & 0x20) != 0)
                {
                    g1.b(2);
                }
                g1.b(1);
                for (k1 = g1.d(); k1 > 127; k1 = g1.d()) { }
                g1.b(13);
                g1.b(1);
                l1 = g1.d();
                for (k1 = l1 & 0x7f; l1 > 127; k1 = k1 << 8 | l1 & 0x7f)
                {
                    l1 = g1.d();
                }

                abyte0 = new byte[k1];
                g1.a(abyte0, 0, k1);
                Pair pair = com.google.android.exoplayer.d.a.d.a(abyte0);
                k1 = ((Integer)pair.first).intValue();
                l1 = ((Integer)pair.second).intValue();
            } else
            if (k3 == 0x73696e66)
            {
                j2 = b(g1, k2, j3);
                k2 = k1;
                k1 = l1;
                l1 = k2;
            } else
            {
                int l2 = k1;
                k1 = l1;
                l1 = l2;
            }
            k2 = i2 + j3;
            i2 = l1;
            l1 = k1;
            k1 = i2;
            i2 = k2;
        }
        return Pair.create(ag.b("audio/mp4a-latm", i3, k1, l1, Collections.singletonList(abyte0)), j2);
    }

    private void a(int i1)
    {
        i1;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 38
    //                   1 32
    //                   2 61
    //                   3 69;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        i = i1;
        return;
_L2:
        j = 0;
        if (h.isEmpty())
        {
            k = 0;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        p = 0;
        continue; /* Loop/switch isn't completed */
_L4:
        q = 0;
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void a(com.google.android.exoplayer.d.a.b b1)
    {
        boolean flag = false;
        byte byte0 = 8;
        Object obj = b1.b;
        for (int i1 = 0; i1 < ((List) (obj)).size(); i1++)
        {
            Object obj1 = (com.google.android.exoplayer.d.a.a)((List) (obj)).get(i1);
            if (((com.google.android.exoplayer.d.a.a) (obj1)).a == 0x70737368)
            {
                obj1 = ((c)obj1).a();
                ((g) (obj1)).a(12);
                UUID uuid = new UUID(((g) (obj1)).h(), ((g) (obj1)).h());
                int k1 = ((g) (obj1)).g();
                byte abyte0[] = new byte[k1];
                ((g) (obj1)).a(abyte0, 0, k1);
                v.put(uuid, abyte0);
            }
        }

        obj = b1.b(0x6d766578).a(0x74726578).a();
        ((g) (obj)).a(16);
        y = new e(((g) (obj)).j() - 1, ((g) (obj)).j(), ((g) (obj)).j(), ((g) (obj)).g());
        obj = b1.b(0x7472616b);
        b1 = ((com.google.android.exoplayer.d.a.b) (obj)).b(0x6d646961);
        g g1 = b1.a(0x68646c72).a();
        g1.a(16);
        int l1 = g1.g();
        if (l1 == 0x736f756e || l1 == 0x76696465)
        {
            flag = true;
        }
        com.google.android.exoplayer.e.a.b(flag);
        obj = ((com.google.android.exoplayer.d.a.b) (obj)).a(0x746b6864).a();
        ((g) (obj)).a(8);
        int i2 = b(((g) (obj)).g());
        int j1;
        long l2;
        if (i2 == 0)
        {
            j1 = 8;
        } else
        {
            j1 = 16;
        }
        ((g) (obj)).b(j1);
        j1 = ((g) (obj)).g();
        ((g) (obj)).b(4);
        if (i2 == 0)
        {
            l2 = ((g) (obj)).f();
        } else
        {
            l2 = ((g) (obj)).k();
        }
        i2 = ((Integer)Pair.create(Integer.valueOf(j1), Long.valueOf(l2)).first).intValue();
        obj = b1.a(0x6d646864).a();
        ((g) (obj)).a(8);
        if (b(((g) (obj)).g()) == 0)
        {
            j1 = byte0;
        } else
        {
            j1 = 16;
        }
        ((g) (obj)).b(j1);
        l2 = ((g) (obj)).f();
        b1 = a(b1.b(0x6d696e66).b(0x7374626c).a(0x73747364).a());
        x = new i(i2, l1, l2, (ag)((Pair) (b1)).first, (j[])((Pair) (b1)).second);
    }

    private static int b(int i1)
    {
        return i1 >> 24 & 0xff;
    }

    private int b(p p1, ah ah1)
    {
        Object obj1;
        int l2;
        l2 = z.c[s];
        obj1 = ah1.c;
        if (i != 3) goto _L2; else goto _L1
_L1:
        Object obj2;
        int i1;
        Object obj;
label0:
        {
            ah1.f = (long)z.a(s) * 1000L;
            ah1.e = 0;
            if (z.f[s])
            {
                ah1.e = ah1.e | 1;
                u = s;
            }
            obj = obj1;
            if (!ah1.a)
            {
                break label0;
            }
            if (ah1.c != null)
            {
                obj = obj1;
                if (ah1.c.capacity() >= l2)
                {
                    break label0;
                }
            }
            obj = ByteBuffer.allocate(l2);
            ah1.c = ((ByteBuffer) (obj));
        }
label1:
        {
            int ai[];
            int ai1[];
            byte abyte0[];
            boolean flag1;
label2:
            {
                int ai2[];
                int k1;
                boolean flag;
                if (o != null)
                {
                    obj1 = o;
                } else
                {
                    obj1 = z.j;
                }
                obj2 = obj;
                if (obj1 == null)
                {
                    break label1;
                }
                obj2 = x.e[z.a];
                abyte0 = ((j) (obj2)).c;
                flag1 = ((j) (obj2)).a;
                i1 = ((j) (obj2)).b;
                if (o != null)
                {
                    if (z.h[s] > i1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                {
                    flag = z.i;
                }
                ai = ah1.b.a;
                if (ai != null)
                {
                    obj2 = ai;
                    if (ai.length == 16)
                    {
                        break label2;
                    }
                }
                obj2 = new byte[16];
            }
label3:
            {
                ((g) (obj1)).a(((byte []) (obj2)), 0, i1);
                if (flag)
                {
                    i1 = ((g) (obj1)).e();
                } else
                {
                    i1 = 1;
                }
                ai1 = ah1.b.d;
                if (ai1 != null)
                {
                    ai = ai1;
                    if (ai1.length >= i1)
                    {
                        break label3;
                    }
                }
                ai = new int[i1];
            }
label4:
            {
                ai2 = ah1.b.e;
                if (ai2 != null)
                {
                    ai1 = ai2;
                    if (ai2.length >= i1)
                    {
                        break label4;
                    }
                }
                ai1 = new int[i1];
            }
            if (flag)
            {
                for (k1 = 0; k1 < i1; k1++)
                {
                    ai[k1] = ((g) (obj1)).e();
                    ai1[k1] = ((g) (obj1)).j();
                }

            } else
            {
                ai[0] = 0;
                ai1[0] = z.c[s];
            }
            obj1 = ah1.b;
            int l1;
            if (flag1)
            {
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            ((b) (obj1)).a(i1, ai, ai1, abyte0, ((byte []) (obj2)), l1);
            obj2 = obj;
            if (flag1)
            {
                ah1.e = ah1.e | 2;
                obj2 = obj;
            }
        }
_L4:
        if (obj2 == null)
        {
            i1 = p1.a(l2 - q);
        } else
        {
            i1 = p1.a(((ByteBuffer) (obj2)), l2 - q);
        }
        if (i1 == -1)
        {
            return 2;
        }
        q = i1 + q;
        if (l2 != q)
        {
            a(4);
            return 9;
        }
        if (obj2 != null)
        {
            if (x.b == 0x76696465)
            {
                int k2 = ((ByteBuffer) (obj2)).position() - l2;
                int j2;
                for (int j1 = k2; j1 < k2 + l2; j1 = j2 + 4 + j1)
                {
                    ((ByteBuffer) (obj2)).position(j1);
                    j2 = ((ByteBuffer) (obj2)).get() & 0xff;
                    for (int i2 = 1; i2 < 4; i2++)
                    {
                        j2 = j2 << 8 | ((ByteBuffer) (obj2)).get() & 0xff;
                    }

                    if (j2 < 0)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Top bit not zero: ")).append(j2).toString());
                    }
                    ((ByteBuffer) (obj2)).position(j1);
                    ((ByteBuffer) (obj2)).put(a);
                }

                ((ByteBuffer) (obj2)).position(k2 + l2);
            }
            ah1.d = l2;
        } else
        {
            ah1.d = 0;
        }
        s = s + 1;
        a(3);
        return 4;
_L2:
        obj2 = obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static j b(g g1, int i1, int j1)
    {
        Object obj;
        int k1;
        k1 = i1 + 8;
        obj = null;
_L2:
        int l1;
        int i2;
        if (k1 - i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        g1.a(k1);
        i2 = g1.g();
        l1 = g1.g();
        if (l1 != 0x66726d61)
        {
            break; /* Loop/switch isn't completed */
        }
        g1.g();
_L5:
        k1 += i2;
        if (true) goto _L2; else goto _L1
_L1:
        if (l1 != 0x7363686d) goto _L4; else goto _L3
_L3:
        g1.b(4);
        g1.g();
        g1.g();
          goto _L5
_L4:
        if (l1 != 0x73636869) goto _L5; else goto _L6
_L6:
        l1 = k1 + 8;
_L7:
        int j2;
label0:
        {
            if (l1 - k1 >= i2)
            {
                break MISSING_BLOCK_LABEL_202;
            }
            g1.a(l1);
            j2 = g1.g();
            if (g1.g() != 0x74656e63)
            {
                break label0;
            }
            g1.b(4);
            l1 = g1.g();
            boolean flag;
            if (l1 >> 8 == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = new byte[16];
            g1.a(((byte []) (obj)), 0, obj.length);
            obj = new j(flag, l1 & 0xff, ((byte []) (obj)));
        }
          goto _L5
        l1 += j2;
          goto _L7
        obj = null;
          goto _L5
        return ((j) (obj));
    }

    private void b(com.google.android.exoplayer.d.a.b b1)
    {
        z = new k();
        i i1 = x;
        e e1 = y;
        k k1 = z;
        boolean flag3 = e;
        Object obj = b1.a(0x6d666864).a();
        ((g) (obj)).a(12);
        ((g) (obj)).j();
        b1 = b1.b(0x74726166);
        obj = b1.a(0x7361697a);
        if (obj != null)
        {
            obj = ((c) (obj)).a();
            ((g) (obj)).a(8);
            if ((((g) (obj)).g() & 0xffffff & 1) == 1)
            {
                ((g) (obj)).b(8);
            }
            int k4 = ((g) (obj)).d();
            int i4 = ((g) (obj)).j();
            int ai[] = new int[i4];
            int l2;
            if (k4 == 0)
            {
                int j1 = 0;
                int j3 = 0;
                do
                {
                    l2 = j1;
                    if (j3 >= i4)
                    {
                        break;
                    }
                    ai[j3] = ((g) (obj)).d();
                    l2 = ai[j3];
                    j3++;
                    j1 = l2 + j1;
                } while (true);
            } else
            {
                int l1 = 0;
                int k3 = 0;
                do
                {
                    l2 = l1;
                    if (k3 >= i4)
                    {
                        break;
                    }
                    ai[k3] = k4;
                    k3++;
                    l1 += k4;
                } while (true);
            }
            k1.g = l2;
            k1.h = ai;
        }
        int ai1[];
        int ai2[];
        int ai3[];
        boolean aflag[];
        int i2;
        int i3;
        int l3;
        int j4;
        boolean flag;
        boolean flag1;
        boolean flag2;
        int l4;
        int l5;
        int i6;
        long l6;
        long l7;
        if (b1.a(0x74666474) == null)
        {
            l6 = 0L;
        } else
        {
            obj = b1.a(0x74666474).a();
            ((g) (obj)).a(8);
            if (b(((g) (obj)).g()) == 1)
            {
                l6 = ((g) (obj)).k();
            } else
            {
                l6 = ((g) (obj)).f();
            }
        }
        obj = b1.a(0x74666864).a();
        ((g) (obj)).a(8);
        j4 = 0xffffff & ((g) (obj)).g();
        ((g) (obj)).b(4);
        if ((j4 & 1) != 0)
        {
            ((g) (obj)).b(8);
        }
        if ((j4 & 2) != 0)
        {
            i2 = ((g) (obj)).j() - 1;
        } else
        {
            i2 = e1.a;
        }
        if ((j4 & 8) != 0)
        {
            i3 = ((g) (obj)).j();
        } else
        {
            i3 = e1.b;
        }
        if ((j4 & 0x10) != 0)
        {
            l3 = ((g) (obj)).j();
        } else
        {
            l3 = e1.c;
        }
        if ((j4 & 0x20) != 0)
        {
            j4 = ((g) (obj)).j();
        } else
        {
            j4 = e1.d;
        }
        e1 = new e(i2, i3, l3, j4);
        k1.a = e1.a;
        obj = b1.a(0x7472756e).a();
        ((g) (obj)).a(8);
        i2 = ((g) (obj)).g();
        l5 = b(i2);
        i3 = 0xffffff & i2;
        i6 = ((g) (obj)).j();
        if ((i3 & 1) != 0)
        {
            ((g) (obj)).b(4);
        }
        if ((i3 & 4) != 0)
        {
            l3 = 1;
        } else
        {
            l3 = 0;
        }
        i2 = e1.d;
        if (l3 != 0)
        {
            i2 = ((g) (obj)).j();
        }
        if ((i3 & 0x100) != 0)
        {
            j4 = 1;
        } else
        {
            j4 = 0;
        }
        if ((i3 & 0x200) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i3 & 0x400) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((i3 & 0x800) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ai1 = new int[i6];
        ai2 = new int[i6];
        ai3 = new int[i6];
        aflag = new boolean[i6];
        l7 = i1.c;
        l4 = 0;
        while (l4 < i6) 
        {
            int i5;
            int j5;
            if (j4 != 0)
            {
                i5 = ((g) (obj)).j();
            } else
            {
                i5 = e1.b;
            }
            if (flag)
            {
                j5 = ((g) (obj)).j();
            } else
            {
                j5 = e1.c;
            }
            if (l4 == 0 && l3 != 0)
            {
                i3 = i2;
            } else
            if (flag1)
            {
                i3 = ((g) (obj)).g();
            } else
            {
                i3 = e1.d;
            }
            if (flag2)
            {
                int k5;
                if (l5 == 0 && !flag3)
                {
                    k5 = ((g) (obj)).j();
                } else
                {
                    k5 = ((g) (obj)).g();
                }
                ai3[l4] = (int)((long)(k5 * 1000) / l7);
            }
            ai2[l4] = (int)((1000L * l6) / l7);
            ai1[l4] = j5;
            if ((i3 >> 16 & 1) == 0)
            {
                i3 = 1;
            } else
            {
                i3 = 0;
            }
            j5 = i3;
            if (i1.b == 0x76696465)
            {
                j5 = i3;
                if (flag3)
                {
                    j5 = i3;
                    if (l4 != 0)
                    {
                        j5 = 0;
                    }
                }
            }
            if (j5 != 0)
            {
                aflag[l4] = true;
            }
            l6 = (long)i5 + l6;
            l4++;
        }
        k1.c = ai1;
        k1.d = ai2;
        k1.e = ai3;
        k1.f = aflag;
        k1.b = ai1.length;
        b1 = b1.a(0x75756964);
        if (b1 != null)
        {
            b1 = b1.a();
            b1.a(8);
            byte abyte0[] = new byte[16];
            b1.a(abyte0, 0, 16);
            if (Arrays.equals(abyte0, b))
            {
                int j2 = b1.g() & 0xffffff;
                if ((j2 & 1) != 0)
                {
                    throw new IllegalStateException("Overriding TrackEncryptionBox parameters is unsupported");
                }
                boolean flag4;
                if ((j2 & 2) != 0)
                {
                    flag4 = true;
                } else
                {
                    flag4 = false;
                }
                j2 = b1.j();
                if (j2 != k1.b)
                {
                    throw new IllegalStateException((new StringBuilder("Length mismatch: ")).append(j2).append(", ").append(k1.b).toString());
                }
                g g1 = new g(b1.b() - b1.c());
                b1.a(g1.a(), 0, g1.b());
                k1.j = g1;
                k1.i = flag4;
            }
        }
        s = 0;
        u = 0;
        t = 0;
        if (r != 0)
        {
            for (int k2 = 0; k2 < z.b; k2++)
            {
                if (z.f[k2] && z.a(k2) <= r)
                {
                    t = k2;
                }
            }

            r = 0;
        }
    }

    private static byte[] b(g g1)
    {
        int i1 = g1.e();
        int j1 = g1.c();
        g1.b(i1);
        return com.google.android.exoplayer.d.a.d.a(g1.a(), j1, i1);
    }

    public final int a(p p1, ah ah1)
    {
        int i1 = 0;
_L7:
        if ((i1 & 7) != 0) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 72
    //                   1 394
    //                   2 961;
           goto _L3 _L4 _L5 _L6
_L3:
        int j1;
        Object obj;
        int ai[];
        long al[];
        long al1[];
        long al2[];
        int k1;
        int i2;
        long l2;
        long l3;
        long l4;
        long l5;
        if (s >= z.b)
        {
            a(0);
            j1 = 0;
        } else
        if (s < t)
        {
            int l1;
            if (i == 3)
            {
                g g1;
                if (o != null)
                {
                    g1 = o;
                } else
                {
                    g1 = z.j;
                }
                if (g1 != null)
                {
                    j1 = x.e[z.a].b;
                    boolean flag;
                    if (o != null)
                    {
                        if (z.h[s] > j1)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    } else
                    {
                        flag = z.i;
                    }
                    g1.b(j1);
                    if (flag)
                    {
                        j1 = g1.e();
                    } else
                    {
                        j1 = 1;
                    }
                    if (flag)
                    {
                        g1.b(j1 * 6);
                    }
                }
            }
            j1 = z.c[s];
            l1 = p1.a(j1 - q);
            if (l1 == -1)
            {
                j1 = 2;
            } else
            {
                q = l1 + q;
                if (j1 != q)
                {
                    a(4);
                    j1 = 1;
                } else
                {
                    s = s + 1;
                    a(3);
                    j1 = 0;
                }
            }
        } else
        {
            j1 = b(p1, ah1);
        }
        i1 = j1 | i1;
          goto _L7
_L4:
        j1 = j;
        j1 = p1.a(f.a(), j, 8 - j1);
        if (j1 == -1)
        {
            j1 = 2;
        } else
        {
            k = k + j1;
            j = j1 + j;
            if (j != 8)
            {
                j1 = 1;
            } else
            {
                f.a(0);
                m = f.g();
                l = f.g();
                if (l == 0x6d646174)
                {
                    j1 = z.g;
                    if (j1 > 0)
                    {
                        o = new g(j1);
                        a(2);
                    } else
                    {
                        o = null;
                        a(3);
                    }
                    j1 = 0;
                } else
                {
                    if (c.contains(Integer.valueOf(l)))
                    {
                        if (d.contains(Integer.valueOf(l)))
                        {
                            a(0);
                            g.add(new com.google.android.exoplayer.d.a.b(l));
                            h.add(Integer.valueOf((k + m) - 8));
                        } else
                        {
                            n = new g(m);
                            System.arraycopy(f.a(), 0, n.a(), 0, 8);
                            a(1);
                        }
                    } else
                    {
                        n = null;
                        a(1);
                    }
                    j1 = 0;
                }
            }
        }
        i1 = j1 | i1;
          goto _L7
_L5:
        if (n != null)
        {
            j1 = p1.a(n.a(), j, m - j);
        } else
        {
            j1 = p1.a(m - j);
        }
        if (j1 != -1) goto _L9; else goto _L8
_L8:
        j1 = 2;
_L12:
        i1 |= j1;
          goto _L7
_L9:
        k = k + j1;
        j = j1 + j;
        if (j == m) goto _L11; else goto _L10
_L10:
        j1 = 1;
          goto _L12
_L11:
        if (n == null) goto _L14; else goto _L13
_L13:
        obj = new c(l, n);
        if (g.isEmpty()) goto _L16; else goto _L15
_L15:
        ((com.google.android.exoplayer.d.a.b)g.peek()).a(((com.google.android.exoplayer.d.a.a) (obj)));
_L19:
        j1 = 0;
_L20:
        j1 |= 0;
          goto _L17
_L16:
        if (((c) (obj)).a != 0x73696478) goto _L19; else goto _L18
_L18:
        obj = ((c) (obj)).a();
        ((g) (obj)).a(8);
        j1 = b(((g) (obj)).g());
        ((g) (obj)).b(4);
        l4 = ((g) (obj)).f();
        if (j1 == 0)
        {
            l3 = ((g) (obj)).f();
            l2 = ((g) (obj)).f();
        } else
        {
            l3 = ((g) (obj)).k();
            l2 = ((g) (obj)).k();
        }
        ((g) (obj)).b(2);
        k1 = ((g) (obj)).e();
        ai = new int[k1];
        al = new long[k1];
        al1 = new long[k1];
        al2 = new long[k1];
        for (j1 = 0; j1 < k1; j1++)
        {
            i2 = ((g) (obj)).g();
            if ((0x80000000 & i2) != 0)
            {
                throw new IllegalStateException("Unhandled indirect reference");
            }
            l5 = ((g) (obj)).f();
            ai[j1] = i2 & 0x7fffffff;
            al[j1] = l2;
            al2[j1] = (0xf4240L * l3) / l4;
            al1[j1] = ((l3 + l5) * 0xf4240L) / l4 - al2[j1];
            l3 += l5;
            ((g) (obj)).b(4);
            l2 += ai[j1];
        }

        w = new h(((g) (obj)).b(), ai, al, al1, al2);
        j1 = 32;
          goto _L20
_L17:
        while (!h.isEmpty() && ((Integer)h.peek()).intValue() == k) 
        {
            h.pop();
            obj = (com.google.android.exoplayer.d.a.b)g.pop();
            if (((com.google.android.exoplayer.d.a.b) (obj)).a == 0x6d6f6f76)
            {
                a(((com.google.android.exoplayer.d.a.b) (obj)));
                k1 = 16;
            } else
            {
                if (((com.google.android.exoplayer.d.a.b) (obj)).a == 0x6d6f6f66)
                {
                    b(((com.google.android.exoplayer.d.a.b) (obj)));
                } else
                if (!g.isEmpty())
                {
                    ((com.google.android.exoplayer.d.a.b)g.peek()).a(((com.google.android.exoplayer.d.a.a) (obj)));
                }
                k1 = 0;
            }
            j1 = k1 | j1;
        }
        a(0);
          goto _L12
_L6:
        j1 = o.b();
        k1 = p1.a(o.a(), p, j1 - p);
        if (k1 == -1)
        {
            j1 = 2;
        } else
        {
            p = k1 + p;
            if (p < j1)
            {
                j1 = 1;
            } else
            {
                a(3);
                j1 = 0;
            }
        }
        i1 = j1 | i1;
          goto _L7
_L2:
        return i1;
_L14:
        j1 = 0;
          goto _L17
    }

    public final h a()
    {
        return w;
    }

    public final boolean a(long l1, boolean flag)
    {
        r = (int)(l1 / 1000L);
        if (flag && z != null && r >= z.a(0) && r <= z.a(z.b - 1))
        {
            int i1 = 0;
            int j1 = 0;
            int k1 = 0;
            while (i1 < z.b) 
            {
                int i2 = j1;
                if (z.a(i1) <= r)
                {
                    if (z.f[i1])
                    {
                        j1 = i1;
                    }
                    k1 = i1;
                    i2 = j1;
                }
                i1++;
                j1 = i2;
            }
            if (j1 == u && k1 >= s)
            {
                r = 0;
                return false;
            }
        }
        g.clear();
        h.clear();
        a(0);
        return true;
    }

    public final Map b()
    {
        if (v.isEmpty())
        {
            return null;
        } else
        {
            return v;
        }
    }

    public final ag c()
    {
        if (x == null)
        {
            return null;
        } else
        {
            return x.d;
        }
    }

    public final i d()
    {
        return x;
    }

    static 
    {
        HashSet hashset = new HashSet();
        hashset.add(Integer.valueOf(0x61766331));
        hashset.add(Integer.valueOf(0x65736473));
        hashset.add(Integer.valueOf(0x68646c72));
        hashset.add(Integer.valueOf(0x6d646174));
        hashset.add(Integer.valueOf(0x6d646864));
        hashset.add(Integer.valueOf(0x6d666864));
        hashset.add(Integer.valueOf(0x6d6f6f66));
        hashset.add(Integer.valueOf(0x6d6f6f76));
        hashset.add(Integer.valueOf(0x6d703461));
        hashset.add(Integer.valueOf(0x73696478));
        hashset.add(Integer.valueOf(0x73747364));
        hashset.add(Integer.valueOf(0x74666474));
        hashset.add(Integer.valueOf(0x74666864));
        hashset.add(Integer.valueOf(0x746b6864));
        hashset.add(Integer.valueOf(0x74726166));
        hashset.add(Integer.valueOf(0x7472616b));
        hashset.add(Integer.valueOf(0x74726578));
        hashset.add(Integer.valueOf(0x7472756e));
        hashset.add(Integer.valueOf(0x6d766578));
        hashset.add(Integer.valueOf(0x6d646961));
        hashset.add(Integer.valueOf(0x6d696e66));
        hashset.add(Integer.valueOf(0x7374626c));
        hashset.add(Integer.valueOf(0x70737368));
        hashset.add(Integer.valueOf(0x7361697a));
        hashset.add(Integer.valueOf(0x75756964));
        c = Collections.unmodifiableSet(hashset);
        hashset = new HashSet();
        hashset.add(Integer.valueOf(0x6d6f6f76));
        hashset.add(Integer.valueOf(0x7472616b));
        hashset.add(Integer.valueOf(0x6d646961));
        hashset.add(Integer.valueOf(0x6d696e66));
        hashset.add(Integer.valueOf(0x7374626c));
        hashset.add(Integer.valueOf(0x61766343));
        hashset.add(Integer.valueOf(0x6d6f6f66));
        hashset.add(Integer.valueOf(0x74726166));
        hashset.add(Integer.valueOf(0x6d766578));
        d = Collections.unmodifiableSet(hashset);
    }
}
