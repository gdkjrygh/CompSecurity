// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.BaseObj;
import android.renderscript.RSRuntimeException;
import android.renderscript.Type;
import java.util.HashMap;

// Referenced classes of package android.support.v8.renderscript:
//            Type, ElementThunker, ExceptionThunker, RenderScriptThunker, 
//            RenderScript, Element

class TypeThunker extends android.support.v8.renderscript.Type
{

    static HashMap mMap = new HashMap();
    Type mN;

    TypeThunker(RenderScript renderscript, Type type)
    {
        super(0, renderscript);
        mN = type;
        try
        {
            internalCalc();
            mElement = new ElementThunker(renderscript, type.getElement());
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        synchronized (mMap)
        {
            mMap.put(mN, this);
        }
        return;
        type;
        renderscript;
        JVM INSTR monitorexit ;
        throw type;
    }

    static android.support.v8.renderscript.Type create(RenderScript renderscript, Element element, int i, int j, int k, boolean flag, boolean flag1, int l)
    {
        element = (ElementThunker)element;
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        try
        {
            element = new android.renderscript.Type.Builder(renderscriptthunker.mN, ((ElementThunker) (element)).mN);
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        element.setX(i);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        element.setY(j);
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        element.setZ(k);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        element.setMipmaps(flag);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        element.setFaces(flag1);
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        element.setYuvFormat(l);
        renderscript = new TypeThunker(renderscript, element.create());
        renderscript.internalCalc();
        return renderscript;
    }

    static android.support.v8.renderscript.Type find(Type type)
    {
        return (android.support.v8.renderscript.Type)mMap.get(type);
    }

    volatile BaseObj getNObj()
    {
        return getNObj();
    }

    Type getNObj()
    {
        return mN;
    }

    void internalCalc()
    {
        mDimX = mN.getX();
        mDimY = mN.getY();
        mDimZ = mN.getZ();
        mDimFaces = mN.hasFaces();
        mDimMipmaps = mN.hasMipmaps();
        mDimYuv = mN.getYuv();
        calcElementCount();
    }

}
