// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsic, RenderScript, RenderScriptThunker, ScriptIntrinsicConvolve3x3Thunker, 
//            Element, RSIllegalArgumentException, FieldPacker, Allocation

public class ScriptIntrinsicConvolve3x3 extends ScriptIntrinsic
{

    private Allocation mInput;
    private final float mValues[] = new float[9];

    ScriptIntrinsicConvolve3x3(int i, RenderScript renderscript)
    {
        super(i, renderscript);
    }

    public static ScriptIntrinsicConvolve3x3 create(RenderScript renderscript, Element element)
    {
        if (RenderScript.isNative)
        {
            RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
            return ScriptIntrinsicConvolve3x3Thunker.create(renderscript, element);
        }
        if (!element.isCompatible(Element.U8_4(renderscript)))
        {
            throw new RSIllegalArgumentException("Unsuported element type.");
        } else
        {
            renderscript = new ScriptIntrinsicConvolve3x3(renderscript.nScriptIntrinsicCreate(1, element.getID(renderscript)), renderscript);
            renderscript.setCoefficients(new float[] {
                0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F
            });
            return renderscript;
        }
    }

    public void forEach(Allocation allocation)
    {
        forEach(0, null, allocation, null);
    }

    public Script.FieldID getFieldID_Input()
    {
        return createFieldID(1, null);
    }

    public Script.KernelID getKernelID()
    {
        return createKernelID(0, 2, null, null);
    }

    public void setCoefficients(float af[])
    {
        FieldPacker fieldpacker = new FieldPacker(36);
        for (int i = 0; i < mValues.length; i++)
        {
            mValues[i] = af[i];
            fieldpacker.addF32(mValues[i]);
        }

        setVar(0, fieldpacker);
    }

    public void setInput(Allocation allocation)
    {
        mInput = allocation;
        setVar(1, allocation);
    }
}
