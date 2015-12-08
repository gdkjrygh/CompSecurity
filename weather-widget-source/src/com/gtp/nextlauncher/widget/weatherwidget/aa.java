// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.AnimationUtils;
import com.go.gl.graphics.BitmapGLDrawable;
import com.go.gl.graphics.BitmapTexture;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.graphics.RenderContext;
import com.go.gl.graphics.Renderable;
import com.go.gl.graphics.Texture;
import com.go.gl.graphics.TextureShader;
import com.go.gl.view.GLView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            l, ab, m, o

public class aa
{

    private boolean A;
    private long B;
    private boolean C;
    private int D;
    private long E;
    private float F;
    private float G;
    private int H;
    private int I;
    private boolean J;
    private long K;
    private int L;
    private int M;
    private boolean N;
    private Renderable O;
    protected ArrayList a;
    private GLView b;
    private Bitmap c;
    private Texture d;
    private TextureShader e;
    private List f;
    private l g[];
    private float h;
    private float i;
    private float j;
    private int k;
    private int l;
    private FloatBuffer m;
    private FloatBuffer n;
    private ShortBuffer o;
    private float p;
    private BitmapGLDrawable q;
    private GLDrawable r;
    private GLDrawable s;
    private float t;
    private float u;
    private int v;
    private int w;
    private float x;
    private float y;
    private int z;

    public aa(GLView glview, float f1, float f2, float f3, float f4, float f5, boolean flag, 
            float f6, float f7)
    {
        a = new ArrayList();
        g = new l[6];
        p = 0.0F;
        v = 60;
        w = 48;
        E = 400L;
        F = 0.0F;
        G = 0.0F;
        H = -1;
        I = -1;
        O = new ab(this);
        b = glview;
        e = TextureShader.getShader(16);
        f = new ArrayList();
        h = f1 / 2.0F;
        i = f2;
        j = f3;
        t = f4;
        u = f5;
        F = f6;
        G = f7;
        f();
        c();
    }

    static FloatBuffer a(aa aa1)
    {
        return aa1.m;
    }

    static FloatBuffer b(aa aa1)
    {
        return aa1.n;
    }

    static ShortBuffer c(aa aa1)
    {
        return aa1.o;
    }

    static int d(aa aa1)
    {
        return aa1.l;
    }

    private void f()
    {
        m m1 = a(h, i + F, 0.0F);
        m m2 = a(-h, i + F, 0.0F);
        m m3 = a(-h, F + 0.0F, 0.0F);
        m m4 = a(h, F + 0.0F, 0.0F);
        m1.a(1.0F, 0.0F);
        m2.a(0.0F, 0.0F);
        m3.a(0.0F, 1.0F);
        m4.a(1.0F, 1.0F);
        g[0] = new l(m1, m2, m3, m4);
        m1 = a(h, i + G, -j);
        m2 = a(-h, i + G, -j);
        m3 = a(-h, i + F, 0.0F);
        m4 = a(h, i + F, 0.0F);
        m1.a(1.0F, 0.0F);
        m2.a(0.0F, 0.0F);
        m3.a(0.0F, 1.0F);
        m4.a(1.0F, 1.0F);
        g[1] = new l(m1, m2, m3, m4);
        m1 = a(h, G + 0.0F, -j);
        m2 = a(-h, G + 0.0F, -j);
        m3 = a(-h, i + G, -j);
        m4 = a(h, i + G, -j);
        m1.a(1.0F, 0.0F);
        m2.a(0.0F, 0.0F);
        m3.a(0.0F, 1.0F);
        m4.a(1.0F, 1.0F);
        g[2] = new l(m1, m2, m3, m4);
        m1 = a(h, F + 0.0F, 0.0F);
        m2 = a(-h, F + 0.0F, 0.0F);
        m3 = a(-h, G + 0.0F, -j);
        m4 = a(h, G + 0.0F, -j);
        m1.a(1.0F, 0.0F);
        m2.a(0.0F, 0.0F);
        m3.a(0.0F, 1.0F);
        m4.a(1.0F, 1.0F);
        g[3] = new l(m1, m2, m3, m4);
        m1 = a(-h, i + F, 0.0F);
        m2 = a(-h, i + G, -j);
        m3 = a(-h, G + 0.0F, -j);
        m4 = a(-h, F + 0.0F, 0.0F);
        m1.a(1.0F, 0.0F);
        m2.a(0.0F, 0.0F);
        m3.a(0.0F, 1.0F);
        m4.a(1.0F, 1.0F);
        g[4] = new l(m1, m2, m3, m4);
        m1 = a(h, i + G, -j);
        m2 = a(h, i + F, 0.0F);
        m3 = a(h, F + 0.0F, 0.0F);
        m4 = a(h, G + 0.0F, -j);
        m1.a(1.0F, 0.0F);
        m2.a(0.0F, 0.0F);
        m3.a(0.0F, 1.0F);
        m4.a(1.0F, 1.0F);
        g[5] = new l(m1, m2, m3, m4);
    }

    private void g()
    {
        float f1 = Math.max(0.0F, Math.min(((float)(AnimationUtils.currentAnimationTimeMillis() - K) * 1.0F) / (float)E, 1.0F));
        if (N && f1 >= 0.5F)
        {
            N = false;
        }
        if (f1 == 1.0F)
        {
            if (H != I)
            {
                H = I;
                I = -1;
                Object obj = r.getBitmap();
                if (s == null)
                {
                    s = new BitmapGLDrawable(b.getResources(), ((Bitmap) (obj)));
                } else
                {
                    obj = BitmapTexture.createSharedTexture(((Bitmap) (obj)));
                    s.setTexture(((Texture) (obj)));
                }
            }
            J = false;
        } else
        {
            L = (int)((1.0F - f1) * 255F);
            M = (int)(f1 * 255F);
        }
        b.invalidate();
    }

    private void h()
    {
        float f1 = Math.max(0.0F, Math.min(((float)(AnimationUtils.currentAnimationTimeMillis() - B) * 1.0F) / (float)E, 1.0F));
        if (f1 == 1.0F)
        {
            A = false;
        }
        if (C)
        {
            float f2 = b(f1);
            float f4 = x;
            p = f2 * (y - x) + f4;
            f2 = c(f1);
            f4 = x;
            D = -(int)((f2 * (y - x) + f4) * i) - 5;
            z = (int)(f1 * 255F);
        } else
        {
            float f3 = x;
            p = f1 * (y - x) + f3;
            D = -(int)(i * p) - 5;
        }
        b.invalidate();
    }

    public m a(float f1, float f2, float f3)
    {
        m m1 = new m(f1, f2, f3, f.size());
        f.add(m1);
        return m1;
    }

    public void a()
    {
        p = 0.0F;
        D = -(int)(i * p) - 5;
        z = 0;
    }

    public void a(float f1)
    {
        p = f1;
        D = -(int)(i * p) - 5;
    }

    public void a(float f1, float f2, float f3, float f4, float f5)
    {
        h = f1 / 2.0F;
        i = f2;
        j = f3;
        t = f4;
        u = f5;
        D = -(int)(i * p) - 5;
        g[0].a.a(h, i, 0.0F);
        g[0].b.a(-h, i, 0.0F);
        g[0].c.a(-h, 0.0F, 0.0F);
        g[0].d.a(h, 0.0F, 0.0F);
        g[1].a.a(h, i, -j);
        g[1].b.a(-h, i, -j);
        g[1].c.a(-h, i, 0.0F);
        g[1].d.a(h, i, 0.0F);
        g[2].a.a(h, 0.0F, -j);
        g[2].b.a(-h, 0.0F, -j);
        g[2].c.a(-h, i, -j);
        g[2].d.a(h, i, -j);
        g[3].a.a(h, 0.0F, 0.0F);
        g[3].b.a(-h, 0.0F, 0.0F);
        g[3].c.a(-h, 0.0F, -j);
        g[3].d.a(h, 0.0F, -j);
        g[4].a.a(-h, i, 0.0F);
        g[4].b.a(-h, i, -j);
        g[4].c.a(-h, 0.0F, -j);
        g[4].d.a(-h, 0.0F, 0.0F);
        g[5].a.a(h, i, -j);
        g[5].b.a(h, i, 0.0F);
        g[5].c.a(h, 0.0F, 0.0F);
        g[5].d.a(h, 0.0F, -j);
        this;
        JVM INSTR monitorenter ;
        m.position(0);
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((m)iterator.next()).a(m)) { }
        break MISSING_BLOCK_LABEL_633;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void a(float f1, float f2, boolean flag)
    {
        A = true;
        x = f1;
        y = f2;
        C = flag;
        if (flag)
        {
            E = 800L;
        } else
        {
            E = 400L;
        }
        B = AnimationUtils.currentAnimationTimeMillis();
        b.invalidate();
    }

    public void a(float f1, boolean flag)
    {
        A = true;
        x = p;
        y = f1;
        C = flag;
        if (flag)
        {
            E = 800L;
        } else
        {
            E = 400L;
        }
        B = AnimationUtils.currentAnimationTimeMillis();
        b.invalidate();
    }

    public void a(int i1)
    {
        c = BitmapFactory.decodeResource(b.getResources(), i1);
        d = new BitmapTexture(c);
        d.register();
    }

    public void a(GLCanvas glcanvas)
    {
        float f1 = 1.0F;
        glcanvas.setDepthEnable(true);
        if (A)
        {
            h();
        }
        glcanvas.save();
        glcanvas.scale(1.0F, p);
        int i1 = glcanvas.getAlpha();
        if (i1 < 255)
        {
            f1 = (float)i1 * 0.003921569F;
        }
        RenderContext rendercontext = RenderContext.acquire();
        rendercontext.shader = e;
        rendercontext.texture = d;
        rendercontext.alpha = f1;
        glcanvas.getFinalMatrix(rendercontext);
        glcanvas.addRenderable(O, rendercontext);
        glcanvas.restore();
        glcanvas.setDepthEnable(false);
        int j1 = (int)(-h);
        int k1 = -(int)(i * p);
        int j2 = (int)((float)j1 + h * 2.0F);
        int i3 = (int)((double)k1 + (double)(h * 2.0F) * 0.80000000000000004D);
        if (q != null && i3 <= 10)
        {
            q.setBounds(j1, k1, j2, i3);
            q.draw(glcanvas);
        }
        if (J)
        {
            g();
            int l1 = D;
            int k2 = (int)((float)l1 - u);
            j1 = (int)((float)j1 + (h - t / 2.0F));
            int j3 = (int)((float)j1 + t);
            if (s != null)
            {
                glcanvas.setAlpha(L);
                s.setBounds(j1, k2, j3, l1);
                s.draw(glcanvas);
            }
            if (r != null)
            {
                glcanvas.setAlpha(M);
                r.setBounds(j1, k2, j3, l1);
                r.draw(glcanvas);
            }
            glcanvas.setAlpha(i1);
        } else
        if (s != null)
        {
            if (A)
            {
                glcanvas.setAlpha(z);
            }
            int i2 = D;
            int l2 = (int)((float)i2 - u);
            j1 = (int)((float)j1 + (h - t / 2.0F));
            int k3 = (int)((float)j1 + t);
            s.setBounds(j1, l2, k3, i2);
            s.draw(glcanvas);
            glcanvas.setAlpha(i1);
            return;
        }
    }

    public void a(String s1, boolean flag)
    {
        if (flag)
        {
            s1 = com.gtp.nextlauncher.widget.weatherwidget.o.a(b.getContext(), s1, v, w);
        } else
        {
            s1 = com.gtp.nextlauncher.widget.weatherwidget.o.b(b.getContext(), s1, v, w);
        }
        if (q == null)
        {
            q = new BitmapGLDrawable(b.getResources(), s1);
            return;
        } else
        {
            s1 = BitmapTexture.createSharedTexture(s1);
            q.setTexture(s1);
            return;
        }
    }

    public void a(ShortBuffer shortbuffer)
    {
        l al[] = g;
        int j1 = al.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            l l1 = al[i1];
            if (l1 != null)
            {
                l1.a(shortbuffer);
            }
        }

    }

    public float b(float f1)
    {
        if (f1 <= 0.25F)
        {
            return (float)Math.pow(f1 / 0.25F, 2D);
        } else
        {
            f1 = (f1 - 0.25F) / 0.75F;
            return (float)((double)(float)Math.sin((double)(3F * f1) * 6.2831853071795862D) * Math.pow(2D, f1 * -5F) * 0.60000002384185791D + 1.0D);
        }
    }

    public int b()
    {
        int j1 = 0;
        l al[] = g;
        int i2 = al.length;
        for (int i1 = 0; i1 < i2;)
        {
            l l1 = al[i1];
            int k1 = j1;
            if (l1 != null)
            {
                k1 = j1 + l1.a();
            }
            i1++;
            j1 = k1;
        }

        return j1;
    }

    public void b(int i1)
    {
        I = i1;
        if (r == null)
        {
            r = new BitmapGLDrawable((BitmapDrawable)b.getResources().getDrawable(i1));
            return;
        } else
        {
            BitmapTexture bitmaptexture = BitmapTexture.createSharedTexture(BitmapFactory.decodeResource(b.getResources(), i1));
            r.setTexture(bitmaptexture);
            return;
        }
    }

    public float c(float f1)
    {
        if (f1 <= 0.36F)
        {
            return (float)Math.pow(f1 / 0.36F, 2D);
        } else
        {
            f1 = (f1 - 0.36F) / 0.64F;
            return (float)((double)(float)Math.sin((double)(3F * f1) * 6.2831853071795862D) * Math.pow(2D, f1 * -5F) * 0.60000002384185791D + 1.0D);
        }
    }

    public void c()
    {
        k = f.size();
        l = b();
        ByteBuffer bytebuffer = ByteBuffer.allocateDirect(k * 4 * 3);
        bytebuffer.order(ByteOrder.nativeOrder());
        m = bytebuffer.asFloatBuffer();
        bytebuffer = ByteBuffer.allocateDirect(k * 4 * 2);
        bytebuffer.order(ByteOrder.nativeOrder());
        n = bytebuffer.asFloatBuffer();
        bytebuffer = ByteBuffer.allocateDirect(l * 2);
        bytebuffer.order(ByteOrder.nativeOrder());
        o = bytebuffer.asShortBuffer();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((m)iterator.next()).a(m, n)) { }
        a(o);
    }

    public void c(int i1)
    {
        Object obj = BitmapFactory.decodeResource(b.getResources(), i1);
        if (s == null)
        {
            s = new BitmapGLDrawable(b.getResources(), ((Bitmap) (obj)));
            return;
        } else
        {
            obj = BitmapTexture.createSharedTexture(((Bitmap) (obj)));
            s.setTexture(((Texture) (obj)));
            return;
        }
    }

    public void d()
    {
        if (I == H)
        {
            return;
        } else
        {
            J = true;
            N = true;
            K = AnimationUtils.currentAnimationTimeMillis();
            b.invalidate();
            return;
        }
    }

    public void e()
    {
        if (d != null)
        {
            d.unregister();
            d.clear();
        }
        if (q != null)
        {
            q.clear();
            q = null;
        }
        if (s != null)
        {
            s.clear();
            s = null;
        }
        if (r != null)
        {
            r.clear();
            r = null;
        }
        if (c != null && !c.isRecycled())
        {
            c.recycle();
            c = null;
        }
    }
}
