// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Element, RenderScript, RenderScriptThunker, RSIllegalArgumentException

public static class mArraySizes
{

    int mArraySizes[];
    int mCount;
    String mElementNames[];
    Element mElements[];
    RenderScript mRS;
    int mSkipPadding;
    uilderThunker mT;

    public mArraySizes add(Element element, String s)
    {
        return add(element, s, 1);
    }

    public add add(Element element, String s, int i)
    {
        if (mT != null)
        {
            mT.add(element, s, i);
            return this;
        }
        if (i < 1)
        {
            throw new RSIllegalArgumentException("Array size cannot be less than 1.");
        }
        if (mSkipPadding != 0 && s.startsWith("#padding_"))
        {
            mSkipPadding = 0;
            return this;
        }
        if (element.mVectorSize == 3)
        {
            mSkipPadding = 1;
        } else
        {
            mSkipPadding = 0;
        }
        if (mCount == mElements.length)
        {
            Element aelement[] = new Element[mCount + 8];
            String as[] = new String[mCount + 8];
            int ai[] = new int[mCount + 8];
            System.arraycopy(mElements, 0, aelement, 0, mCount);
            System.arraycopy(mElementNames, 0, as, 0, mCount);
            System.arraycopy(mArraySizes, 0, ai, 0, mCount);
            mElements = aelement;
            mElementNames = as;
            mArraySizes = ai;
        }
        mElements[mCount] = element;
        mElementNames[mCount] = s;
        mArraySizes[mCount] = i;
        mCount = mCount + 1;
        return this;
    }

    public Element create()
    {
        if (mT != null)
        {
            return mT.create(mRS);
        }
        mRS.validate();
        Element aelement[] = new Element[mCount];
        String as[] = new String[mCount];
        int ai[] = new int[mCount];
        System.arraycopy(mElements, 0, aelement, 0, mCount);
        System.arraycopy(mElementNames, 0, as, 0, mCount);
        System.arraycopy(mArraySizes, 0, ai, 0, mCount);
        int ai1[] = new int[aelement.length];
        for (int i = 0; i < aelement.length; i++)
        {
            ai1[i] = aelement[i].getID(mRS);
        }

        return new Element(mRS.nElementCreate2(ai1, as, ai), mRS, aelement, as, ai);
    }

    public ker(RenderScript renderscript)
    {
        if (RenderScript.isNative)
        {
            RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
            mT = new uilderThunker(renderscript);
        }
        mRS = renderscript;
        mCount = 0;
        mElements = new Element[8];
        mElementNames = new String[8];
        mArraySizes = new int[8];
    }
}
