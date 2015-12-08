// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            BaseObj, Element, RenderScript, RSInvalidStateException, 
//            RenderScriptThunker, TypeThunker, RSIllegalArgumentException

public class Type extends BaseObj
{
    public static class Builder
    {

        boolean mDimFaces;
        boolean mDimMipmaps;
        int mDimX;
        int mDimY;
        int mDimZ;
        Element mElement;
        RenderScript mRS;
        int mYuv;

        public Type create()
        {
            if (mDimZ > 0)
            {
                if (mDimX < 1 || mDimY < 1)
                {
                    throw new RSInvalidStateException("Both X and Y dimension required when Z is present.");
                }
                if (mDimFaces)
                {
                    throw new RSInvalidStateException("Cube maps not supported with 3D types.");
                }
            }
            if (mDimY > 0 && mDimX < 1)
            {
                throw new RSInvalidStateException("X dimension required when Y is present.");
            }
            if (mDimFaces && mDimY < 1)
            {
                throw new RSInvalidStateException("Cube maps require 2D Types.");
            }
            if (mYuv != 0 && (mDimZ != 0 || mDimFaces || mDimMipmaps))
            {
                throw new RSInvalidStateException("YUV only supports basic 2D.");
            }
            Object obj = mRS;
            if (RenderScript.isNative)
            {
                obj = TypeThunker.create((RenderScriptThunker)mRS, mElement, mDimX, mDimY, mDimZ, mDimMipmaps, mDimFaces, mYuv);
            } else
            {
                obj = new Type(mRS.nTypeCreate(mElement.getID(mRS), mDimX, mDimY, mDimZ, mDimMipmaps, mDimFaces, mYuv), mRS);
            }
            obj.mElement = mElement;
            obj.mDimX = mDimX;
            obj.mDimY = mDimY;
            obj.mDimZ = mDimZ;
            obj.mDimMipmaps = mDimMipmaps;
            obj.mDimFaces = mDimFaces;
            obj.mDimYuv = mYuv;
            ((Type) (obj)).calcElementCount();
            return ((Type) (obj));
        }

        public Builder setFaces(boolean flag)
        {
            mDimFaces = flag;
            return this;
        }

        public Builder setMipmaps(boolean flag)
        {
            mDimMipmaps = flag;
            return this;
        }

        public Builder setX(int i)
        {
            if (i < 1)
            {
                throw new RSIllegalArgumentException("Values of less than 1 for Dimension X are not valid.");
            } else
            {
                mDimX = i;
                return this;
            }
        }

        public Builder setY(int i)
        {
            if (i < 1)
            {
                throw new RSIllegalArgumentException("Values of less than 1 for Dimension Y are not valid.");
            } else
            {
                mDimY = i;
                return this;
            }
        }

        public Builder setYuvFormat(int i)
        {
            switch (i)
            {
            default:
                throw new RSIllegalArgumentException("Only NV21 and YV12 are supported..");

            case 17: // '\021'
            case 842094169: 
                mYuv = i;
                break;
            }
            return this;
        }

        public Builder setZ(int i)
        {
            if (i < 1)
            {
                throw new RSIllegalArgumentException("Values of less than 1 for Dimension Z are not valid.");
            } else
            {
                mDimZ = i;
                return this;
            }
        }

        public Builder(RenderScript renderscript, Element element)
        {
            mDimX = 1;
            element.checkValid();
            mRS = renderscript;
            mElement = element;
        }
    }

    public static final class CubemapFace extends Enum
    {

        private static final CubemapFace $VALUES[];
        public static final CubemapFace NEGATIVE_X;
        public static final CubemapFace NEGATIVE_Y;
        public static final CubemapFace NEGATIVE_Z;
        public static final CubemapFace POSITIVE_X;
        public static final CubemapFace POSITIVE_Y;
        public static final CubemapFace POSITIVE_Z;
        int mID;

        public static CubemapFace valueOf(String s)
        {
            return (CubemapFace)Enum.valueOf(android/support/v8/renderscript/Type$CubemapFace, s);
        }

        public static CubemapFace[] values()
        {
            return (CubemapFace[])$VALUES.clone();
        }

        static 
        {
            POSITIVE_X = new CubemapFace("POSITIVE_X", 0, 0);
            NEGATIVE_X = new CubemapFace("NEGATIVE_X", 1, 1);
            POSITIVE_Y = new CubemapFace("POSITIVE_Y", 2, 2);
            NEGATIVE_Y = new CubemapFace("NEGATIVE_Y", 3, 3);
            POSITIVE_Z = new CubemapFace("POSITIVE_Z", 4, 4);
            NEGATIVE_Z = new CubemapFace("NEGATIVE_Z", 5, 5);
            $VALUES = (new CubemapFace[] {
                POSITIVE_X, NEGATIVE_X, POSITIVE_Y, NEGATIVE_Y, POSITIVE_Z, NEGATIVE_Z
            });
        }

        private CubemapFace(String s, int i, int j)
        {
            super(s, i);
            mID = j;
        }
    }


    boolean mDimFaces;
    boolean mDimMipmaps;
    int mDimX;
    int mDimY;
    int mDimYuv;
    int mDimZ;
    Element mElement;
    int mElementCount;

    Type(int i, RenderScript renderscript)
    {
        super(i, renderscript);
    }

    void calcElementCount()
    {
        boolean flag = hasMipmaps();
        int j = getX();
        int k = getY();
        int l = getZ();
        byte byte0 = 1;
        if (hasFaces())
        {
            byte0 = 6;
        }
        int i = j;
        if (j == 0)
        {
            i = 1;
        }
        j = k;
        if (k == 0)
        {
            j = 1;
        }
        k = l;
        if (l == 0)
        {
            k = 1;
        }
        l = i * j * k * byte0;
        int k1 = i;
        i = l;
        int l1;
        for (; flag && (k1 > 1 || j > 1 || k > 1); k = l1)
        {
            int i1 = k1;
            if (k1 > 1)
            {
                i1 = k1 >> 1;
            }
            int j1 = j;
            if (j > 1)
            {
                j1 = j >> 1;
            }
            l1 = k;
            if (k > 1)
            {
                l1 = k >> 1;
            }
            i += i1 * j1 * l1 * byte0;
            k1 = i1;
            j = j1;
        }

        mElementCount = i;
    }

    public int getCount()
    {
        return mElementCount;
    }

    public Element getElement()
    {
        return mElement;
    }

    public int getX()
    {
        return mDimX;
    }

    public int getY()
    {
        return mDimY;
    }

    public int getYuv()
    {
        return mDimYuv;
    }

    public int getZ()
    {
        return mDimZ;
    }

    public boolean hasFaces()
    {
        return mDimFaces;
    }

    public boolean hasMipmaps()
    {
        return mDimMipmaps;
    }
}
