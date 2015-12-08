// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.BaseObj;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;

// Referenced classes of package android.support.v8.renderscript:
//            Allocation, RenderScriptThunker, TypeThunker, ExceptionThunker, 
//            ElementThunker, Element, BaseObj, Type, 
//            FieldPacker, RenderScript

class AllocationThunker extends android.support.v8.renderscript.Allocation
{

    static android.graphics.BitmapFactory.Options mBitmapOptions;
    Allocation mN;

    AllocationThunker(RenderScript renderscript, Type type, int i, Allocation allocation)
    {
        super(0, renderscript, type, i);
        mType = type;
        mUsage = i;
        mN = allocation;
    }

    static android.renderscript.Allocation.MipmapControl convertMipmapControl(Allocation.MipmapControl mipmapcontrol)
    {
        static class _cls1
        {

            static final int $SwitchMap$android$support$v8$renderscript$Allocation$MipmapControl[];

            static 
            {
                $SwitchMap$android$support$v8$renderscript$Allocation$MipmapControl = new int[Allocation.MipmapControl.values().length];
                try
                {
                    $SwitchMap$android$support$v8$renderscript$Allocation$MipmapControl[Allocation.MipmapControl.MIPMAP_NONE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$android$support$v8$renderscript$Allocation$MipmapControl[Allocation.MipmapControl.MIPMAP_FULL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$android$support$v8$renderscript$Allocation$MipmapControl[Allocation.MipmapControl.MIPMAP_ON_SYNC_TO_TEXTURE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.android.support.v8.renderscript.Allocation.MipmapControl[mipmapcontrol.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return android.renderscript.Allocation.MipmapControl.MIPMAP_NONE;

        case 2: // '\002'
            return android.renderscript.Allocation.MipmapControl.MIPMAP_FULL;

        case 3: // '\003'
            return android.renderscript.Allocation.MipmapControl.MIPMAP_ON_SYNC_TO_TEXTURE;
        }
    }

    public static android.support.v8.renderscript.Allocation createCubemapFromBitmap(RenderScript renderscript, Bitmap bitmap, Allocation.MipmapControl mipmapcontrol, int i)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        try
        {
            bitmap = Allocation.createCubemapFromBitmap(renderscriptthunker.mN, bitmap, convertMipmapControl(mipmapcontrol), i);
            renderscript = new AllocationThunker(renderscript, new TypeThunker(renderscript, bitmap.getType()), i, bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        return renderscript;
    }

    public static android.support.v8.renderscript.Allocation createCubemapFromCubeFaces(RenderScript renderscript, Bitmap bitmap, Bitmap bitmap1, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Allocation.MipmapControl mipmapcontrol, 
            int i)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        try
        {
            bitmap = Allocation.createCubemapFromCubeFaces(renderscriptthunker.mN, bitmap, bitmap1, bitmap2, bitmap3, bitmap4, bitmap5, convertMipmapControl(mipmapcontrol), i);
            renderscript = new AllocationThunker(renderscript, new TypeThunker(renderscript, bitmap.getType()), i, bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        return renderscript;
    }

    public static android.support.v8.renderscript.Allocation createFromBitmap(RenderScript renderscript, Bitmap bitmap, Allocation.MipmapControl mipmapcontrol, int i)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        try
        {
            bitmap = Allocation.createFromBitmap(renderscriptthunker.mN, bitmap, convertMipmapControl(mipmapcontrol), i);
            renderscript = new AllocationThunker(renderscript, new TypeThunker(renderscript, bitmap.getType()), i, bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        return renderscript;
    }

    public static android.support.v8.renderscript.Allocation createFromBitmapResource(RenderScript renderscript, Resources resources, int i, Allocation.MipmapControl mipmapcontrol, int j)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        try
        {
            resources = Allocation.createFromBitmapResource(renderscriptthunker.mN, resources, i, convertMipmapControl(mipmapcontrol), j);
            renderscript = new AllocationThunker(renderscript, new TypeThunker(renderscript, resources.getType()), j, resources);
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        return renderscript;
    }

    public static android.support.v8.renderscript.Allocation createFromString(RenderScript renderscript, String s, int i)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        try
        {
            s = Allocation.createFromString(renderscriptthunker.mN, s, i);
            renderscript = new AllocationThunker(renderscript, new TypeThunker(renderscript, s.getType()), i, s);
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        return renderscript;
    }

    public static android.support.v8.renderscript.Allocation createSized(RenderScript renderscript, android.support.v8.renderscript.Element element, int i, int j)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        ElementThunker elementthunker = (ElementThunker)element;
        try
        {
            element = Allocation.createSized(renderscriptthunker.mN, (Element)element.getNObj(), i, j);
            renderscript = new AllocationThunker(renderscript, new TypeThunker(renderscript, element.getType()), j, element);
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        return renderscript;
    }

    public static android.support.v8.renderscript.Allocation createTyped(RenderScript renderscript, Type type, Allocation.MipmapControl mipmapcontrol, int i)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        TypeThunker typethunker = (TypeThunker)type;
        try
        {
            renderscript = new AllocationThunker(renderscript, type, i, Allocation.createTyped(renderscriptthunker.mN, typethunker.mN, convertMipmapControl(mipmapcontrol), i));
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        return renderscript;
    }

    public void copy1DRangeFrom(int i, int j, android.support.v8.renderscript.Allocation allocation, int k)
    {
        try
        {
            allocation = (AllocationThunker)allocation;
            mN.copy1DRangeFrom(i, j, ((AllocationThunker) (allocation)).mN, k);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v8.renderscript.Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void copy1DRangeFrom(int i, int j, byte abyte0[])
    {
        try
        {
            mN.copy1DRangeFrom(i, j, abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw ExceptionThunker.convertException(abyte0);
        }
    }

    public void copy1DRangeFrom(int i, int j, float af[])
    {
        try
        {
            mN.copy1DRangeFrom(i, j, af);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (float af[])
        {
            throw ExceptionThunker.convertException(af);
        }
    }

    public void copy1DRangeFrom(int i, int j, int ai[])
    {
        try
        {
            mN.copy1DRangeFrom(i, j, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            throw ExceptionThunker.convertException(ai);
        }
    }

    public void copy1DRangeFrom(int i, int j, short aword0[])
    {
        try
        {
            mN.copy1DRangeFrom(i, j, aword0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (short aword0[])
        {
            throw ExceptionThunker.convertException(aword0);
        }
    }

    public void copy1DRangeFromUnchecked(int i, int j, byte abyte0[])
    {
        try
        {
            mN.copy1DRangeFromUnchecked(i, j, abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw ExceptionThunker.convertException(abyte0);
        }
    }

    public void copy1DRangeFromUnchecked(int i, int j, float af[])
    {
        try
        {
            mN.copy1DRangeFromUnchecked(i, j, af);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (float af[])
        {
            throw ExceptionThunker.convertException(af);
        }
    }

    public void copy1DRangeFromUnchecked(int i, int j, int ai[])
    {
        try
        {
            mN.copy1DRangeFromUnchecked(i, j, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            throw ExceptionThunker.convertException(ai);
        }
    }

    public void copy1DRangeFromUnchecked(int i, int j, short aword0[])
    {
        try
        {
            mN.copy1DRangeFromUnchecked(i, j, aword0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (short aword0[])
        {
            throw ExceptionThunker.convertException(aword0);
        }
    }

    public void copy2DRangeFrom(int i, int j, int k, int l, android.support.v8.renderscript.Allocation allocation, int i1, int j1)
    {
        try
        {
            allocation = (AllocationThunker)allocation;
            mN.copy2DRangeFrom(i, j, k, l, ((AllocationThunker) (allocation)).mN, i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v8.renderscript.Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void copy2DRangeFrom(int i, int j, int k, int l, byte abyte0[])
    {
        try
        {
            mN.copy2DRangeFrom(i, j, k, l, abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw ExceptionThunker.convertException(abyte0);
        }
    }

    public void copy2DRangeFrom(int i, int j, int k, int l, float af[])
    {
        try
        {
            mN.copy2DRangeFrom(i, j, k, l, af);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (float af[])
        {
            throw ExceptionThunker.convertException(af);
        }
    }

    public void copy2DRangeFrom(int i, int j, int k, int l, int ai[])
    {
        try
        {
            mN.copy2DRangeFrom(i, j, k, l, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            throw ExceptionThunker.convertException(ai);
        }
    }

    public void copy2DRangeFrom(int i, int j, int k, int l, short aword0[])
    {
        try
        {
            mN.copy2DRangeFrom(i, j, k, l, aword0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (short aword0[])
        {
            throw ExceptionThunker.convertException(aword0);
        }
    }

    public void copy2DRangeFrom(int i, int j, Bitmap bitmap)
    {
        try
        {
            mN.copy2DRangeFrom(i, j, bitmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw ExceptionThunker.convertException(bitmap);
        }
    }

    public void copyFrom(Bitmap bitmap)
    {
        try
        {
            mN.copyFrom(bitmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw ExceptionThunker.convertException(bitmap);
        }
    }

    public void copyFrom(android.support.v8.renderscript.Allocation allocation)
    {
        allocation = (AllocationThunker)allocation;
        try
        {
            mN.copyFrom(((AllocationThunker) (allocation)).mN);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v8.renderscript.Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void copyFrom(byte abyte0[])
    {
        try
        {
            mN.copyFrom(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw ExceptionThunker.convertException(abyte0);
        }
    }

    public void copyFrom(float af[])
    {
        try
        {
            mN.copyFrom(af);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (float af[])
        {
            throw ExceptionThunker.convertException(af);
        }
    }

    public void copyFrom(int ai[])
    {
        try
        {
            mN.copyFrom(ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            throw ExceptionThunker.convertException(ai);
        }
    }

    public void copyFrom(android.support.v8.renderscript.BaseObj abaseobj[])
    {
        if (abaseobj == null)
        {
            return;
        }
        BaseObj abaseobj1[] = new BaseObj[abaseobj.length];
        for (int i = 0; i < abaseobj.length; i++)
        {
            abaseobj1[i] = abaseobj[i].getNObj();
        }

        try
        {
            mN.copyFrom(abaseobj1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v8.renderscript.BaseObj abaseobj[])
        {
            throw ExceptionThunker.convertException(abaseobj);
        }
    }

    public void copyFrom(short aword0[])
    {
        try
        {
            mN.copyFrom(aword0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (short aword0[])
        {
            throw ExceptionThunker.convertException(aword0);
        }
    }

    public void copyFromUnchecked(byte abyte0[])
    {
        try
        {
            mN.copyFromUnchecked(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw ExceptionThunker.convertException(abyte0);
        }
    }

    public void copyFromUnchecked(float af[])
    {
        try
        {
            mN.copyFromUnchecked(af);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (float af[])
        {
            throw ExceptionThunker.convertException(af);
        }
    }

    public void copyFromUnchecked(int ai[])
    {
        try
        {
            mN.copyFromUnchecked(ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            throw ExceptionThunker.convertException(ai);
        }
    }

    public void copyFromUnchecked(short aword0[])
    {
        try
        {
            mN.copyFromUnchecked(aword0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (short aword0[])
        {
            throw ExceptionThunker.convertException(aword0);
        }
    }

    public void copyTo(Bitmap bitmap)
    {
        try
        {
            mN.copyTo(bitmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw ExceptionThunker.convertException(bitmap);
        }
    }

    public void copyTo(byte abyte0[])
    {
        try
        {
            mN.copyTo(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw ExceptionThunker.convertException(abyte0);
        }
    }

    public void copyTo(float af[])
    {
        try
        {
            mN.copyTo(af);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (float af[])
        {
            throw ExceptionThunker.convertException(af);
        }
    }

    public void copyTo(int ai[])
    {
        try
        {
            mN.copyTo(ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            throw ExceptionThunker.convertException(ai);
        }
    }

    public void copyTo(short aword0[])
    {
        try
        {
            mN.copyTo(aword0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (short aword0[])
        {
            throw ExceptionThunker.convertException(aword0);
        }
    }

    public void generateMipmaps()
    {
        try
        {
            mN.generateMipmaps();
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    public int getBytesSize()
    {
        int i;
        try
        {
            i = mN.getBytesSize();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return i;
    }

    public android.support.v8.renderscript.Element getElement()
    {
        return getType().getElement();
    }

    Allocation getNObj()
    {
        return mN;
    }

    volatile BaseObj getNObj()
    {
        return getNObj();
    }

    public Type getType()
    {
        return TypeThunker.find(mN.getType());
    }

    public int getUsage()
    {
        int i;
        try
        {
            i = mN.getUsage();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return i;
    }

    public void ioReceive()
    {
        try
        {
            mN.ioReceive();
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    public void ioSend()
    {
        try
        {
            mN.ioSend();
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    public void setFromFieldPacker(int i, int j, android.support.v8.renderscript.FieldPacker fieldpacker)
    {
        try
        {
            fieldpacker = new FieldPacker(fieldpacker.getData());
            mN.setFromFieldPacker(i, j, fieldpacker);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v8.renderscript.FieldPacker fieldpacker)
        {
            throw ExceptionThunker.convertException(fieldpacker);
        }
    }

    public void setFromFieldPacker(int i, android.support.v8.renderscript.FieldPacker fieldpacker)
    {
        try
        {
            fieldpacker = new FieldPacker(fieldpacker.getData());
            mN.setFromFieldPacker(i, fieldpacker);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v8.renderscript.FieldPacker fieldpacker)
        {
            throw ExceptionThunker.convertException(fieldpacker);
        }
    }

    public void syncAll(int i)
    {
        try
        {
            mN.syncAll(i);
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    static 
    {
        mBitmapOptions = new android.graphics.BitmapFactory.Options();
        mBitmapOptions.inScaled = false;
    }
}
