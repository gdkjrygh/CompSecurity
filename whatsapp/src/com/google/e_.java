// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import com.whatsapp.DialogToastActivity;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google:
//            e3, df, af, b8

public class e_
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    private boolean A;
    private b8 B;
    private b8 C;
    private b8 D;
    private String E;
    private boolean F;
    private String G;
    private boolean H;
    private boolean I;
    private b8 J;
    private boolean K;
    private b8 L;
    private boolean M;
    private boolean N;
    private boolean O;
    private String P;
    private b8 Q;
    private boolean R;
    private boolean S;
    private String T;
    private boolean U;
    private List V;
    private boolean W;
    private boolean X;
    private int Y;
    private boolean Z;
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private b8 e;
    private b8 f;
    private boolean g;
    private String h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private b8 m;
    private b8 n;
    private boolean o;
    private boolean p;
    private b8 q;
    private String r;
    private b8 s;
    private String t;
    private String u;
    private boolean v;
    private List w;
    private boolean x;
    private b8 y;
    private boolean z;

    public e_()
    {
        C = null;
        y = null;
        D = null;
        f = null;
        J = null;
        L = null;
        s = null;
        e = null;
        m = null;
        B = null;
        q = null;
        Q = null;
        n = null;
        t = "";
        Y = 0;
        G = "";
        T = "";
        u = "";
        P = "";
        E = "";
        r = "";
        d = false;
        w = new ArrayList();
        V = new ArrayList();
        i = false;
        h = "";
        b = false;
    }

    public static e3 H()
    {
        return new e3();
    }

    public e_ A()
    {
        V.clear();
        return this;
    }

    public List B()
    {
        return w;
    }

    public b8 C()
    {
        return m;
    }

    public boolean D()
    {
        return k;
    }

    public boolean E()
    {
        return x;
    }

    public b8 F()
    {
        return f;
    }

    public List G()
    {
        return V;
    }

    public boolean I()
    {
        return M;
    }

    public boolean J()
    {
        return b;
    }

    public boolean K()
    {
        return c;
    }

    public String L()
    {
        return E;
    }

    public int M()
    {
        return V.size();
    }

    public boolean N()
    {
        return v;
    }

    public boolean O()
    {
        return p;
    }

    public b8 P()
    {
        return L;
    }

    public boolean Q()
    {
        return O;
    }

    public b8 R()
    {
        return J;
    }

    public boolean S()
    {
        return a;
    }

    public b8 T()
    {
        return n;
    }

    public boolean U()
    {
        return i;
    }

    public boolean V()
    {
        return W;
    }

    public boolean W()
    {
        return Z;
    }

    public b8 X()
    {
        return D;
    }

    public boolean Y()
    {
        return g;
    }

    public boolean Z()
    {
        return N;
    }

    public e_ a(int i1)
    {
        l = true;
        Y = i1;
        return this;
    }

    public e_ a(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            X = true;
            s = b8_1;
            return this;
        }
    }

    public e_ a(df df1)
    {
        if (df1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (df df1)
            {
                throw df1;
            }
        } else
        {
            w.add(df1);
            return this;
        }
    }

    public e_ a(String s1)
    {
        U = true;
        P = s1;
        return this;
    }

    public e_ a(boolean flag)
    {
        p = true;
        i = flag;
        return this;
    }

    public String a()
    {
        return T;
    }

    public boolean aa()
    {
        return U;
    }

    public boolean ab()
    {
        return I;
    }

    public boolean ac()
    {
        return o;
    }

    public int ad()
    {
        return Y;
    }

    public String ae()
    {
        return r;
    }

    public df b(int i1)
    {
        return (df)w.get(i1);
    }

    public e_ b(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            A = true;
            D = b8_1;
            return this;
        }
    }

    public e_ b(df df1)
    {
        if (df1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (df df1)
            {
                throw df1;
            }
        } else
        {
            V.add(df1);
            return this;
        }
    }

    public e_ b(String s1)
    {
        Z = true;
        G = s1;
        return this;
    }

    public e_ b(boolean flag)
    {
        k = true;
        d = flag;
        return this;
    }

    public boolean b()
    {
        return d;
    }

    public df c(int i1)
    {
        return (df)V.get(i1);
    }

    public e_ c(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            v = true;
            B = b8_1;
            return this;
        }
    }

    public e_ c(String s1)
    {
        c = true;
        u = s1;
        return this;
    }

    public e_ c(boolean flag)
    {
        O = true;
        b = flag;
        return this;
    }

    public boolean c()
    {
        return H;
    }

    public b8 d()
    {
        return Q;
    }

    public e_ d(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            g = true;
            L = b8_1;
            return this;
        }
    }

    public e_ d(String s1)
    {
        H = true;
        t = s1;
        return this;
    }

    public e_ e(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            R = true;
            e = b8_1;
            return this;
        }
    }

    public e_ e(String s1)
    {
        K = true;
        r = s1;
        return this;
    }

    public String e()
    {
        return t;
    }

    public e_ f(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            S = true;
            q = b8_1;
            return this;
        }
    }

    public e_ f(String s1)
    {
        I = true;
        T = s1;
        return this;
    }

    public String f()
    {
        return h;
    }

    public e_ g(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            j = true;
            f = b8_1;
            return this;
        }
    }

    public e_ g(String s1)
    {
        N = true;
        E = s1;
        return this;
    }

    public boolean g()
    {
        return X;
    }

    public b8 h()
    {
        return C;
    }

    public e_ h(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            M = true;
            n = b8_1;
            return this;
        }
    }

    public e_ h(String s1)
    {
        z = true;
        h = s1;
        return this;
    }

    public e_ i(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            a = true;
            m = b8_1;
            return this;
        }
    }

    public boolean i()
    {
        return z;
    }

    public e_ j(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            W = true;
            J = b8_1;
            return this;
        }
    }

    public boolean j()
    {
        return i;
    }

    public e_ k(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            o = true;
            Q = b8_1;
            return this;
        }
    }

    public boolean k()
    {
        return A;
    }

    public e_ l(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            x = true;
            y = b8_1;
            return this;
        }
    }

    public boolean l()
    {
        return l;
    }

    public e_ m(b8 b8_1)
    {
        if (b8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (b8 b8_1)
            {
                throw b8_1;
            }
        } else
        {
            F = true;
            C = b8_1;
            return this;
        }
    }

    public boolean m()
    {
        return R;
    }

    public String n()
    {
        return G;
    }

    public boolean o()
    {
        return F;
    }

    public b8 p()
    {
        return s;
    }

    public b8 q()
    {
        return y;
    }

    public boolean r()
    {
        return j;
    }

    public void readExternal(ObjectInput objectinput)
    {
        boolean flag = false;
        int j1 = af.k;
        if (objectinput.readBoolean())
        {
            b8 b8_1 = new b8();
            b8_1.readExternal(objectinput);
            m(b8_1);
        }
        if (objectinput.readBoolean())
        {
            b8 b8_2 = new b8();
            b8_2.readExternal(objectinput);
            l(b8_2);
        }
        if (objectinput.readBoolean())
        {
            b8 b8_3 = new b8();
            b8_3.readExternal(objectinput);
            b(b8_3);
        }
        if (objectinput.readBoolean())
        {
            b8 b8_4 = new b8();
            b8_4.readExternal(objectinput);
            g(b8_4);
        }
        if (objectinput.readBoolean())
        {
            b8 b8_5 = new b8();
            b8_5.readExternal(objectinput);
            j(b8_5);
        }
        if (objectinput.readBoolean())
        {
            b8 b8_6 = new b8();
            b8_6.readExternal(objectinput);
            d(b8_6);
        }
        if (objectinput.readBoolean())
        {
            b8 b8_7 = new b8();
            b8_7.readExternal(objectinput);
            a(b8_7);
        }
        if (objectinput.readBoolean())
        {
            b8 b8_8 = new b8();
            b8_8.readExternal(objectinput);
            e(b8_8);
        }
        if (objectinput.readBoolean())
        {
            b8 b8_9 = new b8();
            b8_9.readExternal(objectinput);
            i(b8_9);
        }
        if (objectinput.readBoolean())
        {
            b8 b8_10 = new b8();
            b8_10.readExternal(objectinput);
            c(b8_10);
        }
        if (objectinput.readBoolean())
        {
            b8 b8_11 = new b8();
            b8_11.readExternal(objectinput);
            f(b8_11);
        }
        if (objectinput.readBoolean())
        {
            b8 b8_12 = new b8();
            b8_12.readExternal(objectinput);
            k(b8_12);
        }
        if (objectinput.readBoolean())
        {
            b8 b8_13 = new b8();
            b8_13.readExternal(objectinput);
            h(b8_13);
        }
        d(objectinput.readUTF());
        a(objectinput.readInt());
        b(objectinput.readUTF());
        int i1;
        int k1;
        if (objectinput.readBoolean())
        {
            try
            {
                f(objectinput.readUTF());
            }
            // Misplaced declaration of an exception variable
            catch (ObjectInput objectinput)
            {
                throw objectinput;
            }
        }
        if (objectinput.readBoolean())
        {
            try
            {
                c(objectinput.readUTF());
            }
            // Misplaced declaration of an exception variable
            catch (ObjectInput objectinput)
            {
                throw objectinput;
            }
        }
        if (objectinput.readBoolean())
        {
            try
            {
                a(objectinput.readUTF());
            }
            // Misplaced declaration of an exception variable
            catch (ObjectInput objectinput)
            {
                throw objectinput;
            }
        }
        if (objectinput.readBoolean())
        {
            try
            {
                g(objectinput.readUTF());
            }
            // Misplaced declaration of an exception variable
            catch (ObjectInput objectinput)
            {
                throw objectinput;
            }
        }
        if (objectinput.readBoolean())
        {
            try
            {
                e(objectinput.readUTF());
            }
            // Misplaced declaration of an exception variable
            catch (ObjectInput objectinput)
            {
                throw objectinput;
            }
        }
        b(objectinput.readBoolean());
        k1 = objectinput.readInt();
        i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            df df1 = new df();
            df1.readExternal(objectinput);
            w.add(df1);
            i1++;
        } while (j1 == 0);
        k1 = objectinput.readInt();
        i1 = ((flag) ? 1 : 0);
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            df df2 = new df();
            df2.readExternal(objectinput);
            V.add(df2);
            i1++;
        } while (j1 == 0);
        a(objectinput.readBoolean());
        if (objectinput.readBoolean())
        {
            try
            {
                h(objectinput.readUTF());
            }
            // Misplaced declaration of an exception variable
            catch (ObjectInput objectinput)
            {
                throw objectinput;
            }
        }
        c(objectinput.readBoolean());
    }

    public b8 s()
    {
        return B;
    }

    public String t()
    {
        return P;
    }

    public boolean u()
    {
        return K;
    }

    public String v()
    {
        return u;
    }

    public boolean w()
    {
        return S;
    }

    public void writeExternal(ObjectOutput objectoutput)
    {
        boolean flag = false;
        int j1 = af.k;
        int i1;
        int k1;
        try
        {
            objectoutput.writeBoolean(F);
            if (F)
            {
                C.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(x);
            if (x)
            {
                y.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(A);
            if (A)
            {
                D.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(j);
            if (j)
            {
                f.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(W);
            if (W)
            {
                J.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(g);
            if (g)
            {
                L.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(X);
            if (X)
            {
                s.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(R);
            if (R)
            {
                e.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(a);
            if (a)
            {
                m.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(v);
            if (v)
            {
                B.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(S);
            if (S)
            {
                q.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(o);
            if (o)
            {
                Q.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(M);
            if (M)
            {
                n.writeExternal(objectoutput);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeUTF(t);
            objectoutput.writeInt(Y);
            objectoutput.writeUTF(G);
            objectoutput.writeBoolean(I);
            if (I)
            {
                objectoutput.writeUTF(T);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(c);
            if (c)
            {
                objectoutput.writeUTF(u);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(U);
            if (U)
            {
                objectoutput.writeUTF(P);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(N);
            if (N)
            {
                objectoutput.writeUTF(E);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        try
        {
            objectoutput.writeBoolean(K);
            if (K)
            {
                objectoutput.writeUTF(r);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutput objectoutput)
        {
            throw objectoutput;
        }
        objectoutput.writeBoolean(d);
        k1 = z();
        objectoutput.writeInt(k1);
        i1 = 0;
        do
        {
label0:
            {
                if (i1 < k1)
                {
                    ((df)w.get(i1)).writeExternal(objectoutput);
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                k1 = M();
                objectoutput.writeInt(k1);
                i1 = ((flag) ? 1 : 0);
                do
                {
label1:
                    {
                        if (i1 < k1)
                        {
                            ((df)V.get(i1)).writeExternal(objectoutput);
                            if (j1 == 0)
                            {
                                break label1;
                            }
                        }
                        try
                        {
                            objectoutput.writeBoolean(i);
                            objectoutput.writeBoolean(z);
                            if (z)
                            {
                                objectoutput.writeUTF(h);
                            }
                        }
                        // Misplaced declaration of an exception variable
                        catch (ObjectOutput objectoutput)
                        {
                            throw objectoutput;
                        }
                        try
                        {
                            objectoutput.writeBoolean(b);
                            if (DialogToastActivity.g != 0)
                            {
                                af.k = j1 + 1;
                            }
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (ObjectOutput objectoutput)
                        {
                            throw objectoutput;
                        }
                    }
                    i1++;
                } while (true);
            }
            i1++;
        } while (true);
    }

    public b8 x()
    {
        return q;
    }

    public b8 y()
    {
        return e;
    }

    public int z()
    {
        return w.size();
    }
}
