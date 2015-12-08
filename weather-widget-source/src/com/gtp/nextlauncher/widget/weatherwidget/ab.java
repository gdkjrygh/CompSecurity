// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.opengl.GLES20;
import com.go.gl.graphics.RenderContext;
import com.go.gl.graphics.Renderable;
import com.go.gl.graphics.Texture;
import com.go.gl.graphics.TextureShader;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            aa

class ab
    implements Renderable
{

    final aa a;

    ab(aa aa1)
    {
        a = aa1;
        super();
    }

    public void run(long l, RenderContext rendercontext)
    {
        TextureShader textureshader;
        for (textureshader = (TextureShader)rendercontext.shader; textureshader == null || !textureshader.bind() || rendercontext.texture == null || !rendercontext.texture.bind();)
        {
            return;
        }

        textureshader.setMatrix(rendercontext.matrix, 0);
        textureshader.setAlpha(rendercontext.alpha);
        synchronized (a)
        {
            aa.a(a).position(0);
            aa.b(a).position(0);
            aa.c(a).position(0);
            textureshader.setPosition(aa.a(a), 3);
            textureshader.setTexCoord(aa.b(a), 2);
            GLES20.glDrawElements(4, aa.d(a), 5123, aa.c(a));
        }
        return;
        exception;
        rendercontext;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
