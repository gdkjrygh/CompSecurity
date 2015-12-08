// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.RSRuntimeException;

// Referenced classes of package android.support.v8.renderscript:
//            ElementThunker, RenderScriptThunker, ExceptionThunker, RenderScript, 
//            Element

static class ion
{

    android.renderscript.nvertException mN;

    public void add(Element element, String s, int i)
    {
        element = (ElementThunker)element;
        try
        {
            mN.mN(((ElementThunker) (element)).mN, s, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Element element)
        {
            throw ExceptionThunker.convertException(element);
        }
    }

    public Element create(RenderScript renderscript)
    {
        try
        {
            renderscript = new ElementThunker(renderscript, mN.mN());
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        return renderscript;
    }

    public (RenderScript renderscript)
    {
        renderscript = (RenderScriptThunker)renderscript;
        try
        {
            mN = new android.renderscript.derThunker.mN(((RenderScriptThunker) (renderscript)).mN);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
    }
}
