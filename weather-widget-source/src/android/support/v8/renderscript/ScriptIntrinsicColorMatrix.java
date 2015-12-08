// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsic, Matrix4f, RenderScript, RenderScriptThunker, 
//            ScriptIntrinsicColorMatrixThunker, Element, RSIllegalArgumentException, FieldPacker, 
//            Allocation, Matrix3f

public class ScriptIntrinsicColorMatrix extends ScriptIntrinsic
{

    private Allocation mInput;
    private final Matrix4f mMatrix = new Matrix4f();

    protected ScriptIntrinsicColorMatrix(int i, RenderScript renderscript)
    {
        super(i, renderscript);
    }

    public static ScriptIntrinsicColorMatrix create(RenderScript renderscript, Element element)
    {
        if (RenderScript.isNative)
        {
            RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
            return ScriptIntrinsicColorMatrixThunker.create(renderscript, element);
        }
        if (!element.isCompatible(Element.U8_4(renderscript)))
        {
            throw new RSIllegalArgumentException("Unsuported element type.");
        } else
        {
            return new ScriptIntrinsicColorMatrix(renderscript.nScriptIntrinsicCreate(2, element.getID(renderscript)), renderscript);
        }
    }

    private void setMatrix()
    {
        FieldPacker fieldpacker = new FieldPacker(64);
        fieldpacker.addMatrix(mMatrix);
        setVar(0, fieldpacker);
    }

    public void forEach(Allocation allocation, Allocation allocation1)
    {
        forEach(0, allocation, allocation1, null);
    }

    public Script.KernelID getKernelID()
    {
        return createKernelID(0, 3, null, null);
    }

    public void setColorMatrix(Matrix3f matrix3f)
    {
        mMatrix.load(matrix3f);
        setMatrix();
    }

    public void setColorMatrix(Matrix4f matrix4f)
    {
        mMatrix.load(matrix4f);
        setMatrix();
    }

    public void setGreyscale()
    {
        mMatrix.loadIdentity();
        mMatrix.set(0, 0, 0.299F);
        mMatrix.set(1, 0, 0.587F);
        mMatrix.set(2, 0, 0.114F);
        mMatrix.set(0, 1, 0.299F);
        mMatrix.set(1, 1, 0.587F);
        mMatrix.set(2, 1, 0.114F);
        mMatrix.set(0, 2, 0.299F);
        mMatrix.set(1, 2, 0.587F);
        mMatrix.set(2, 2, 0.114F);
        setMatrix();
    }

    public void setRGBtoYUV()
    {
        mMatrix.loadIdentity();
        mMatrix.set(0, 0, 0.299F);
        mMatrix.set(1, 0, 0.587F);
        mMatrix.set(2, 0, 0.114F);
        mMatrix.set(0, 1, -0.14713F);
        mMatrix.set(1, 1, -0.28886F);
        mMatrix.set(2, 1, 0.436F);
        mMatrix.set(0, 2, 0.615F);
        mMatrix.set(1, 2, -0.51499F);
        mMatrix.set(2, 2, -0.10001F);
        setMatrix();
    }

    public void setYUVtoRGB()
    {
        mMatrix.loadIdentity();
        mMatrix.set(0, 0, 1.0F);
        mMatrix.set(1, 0, 0.0F);
        mMatrix.set(2, 0, 1.13983F);
        mMatrix.set(0, 1, 1.0F);
        mMatrix.set(1, 1, -0.39465F);
        mMatrix.set(2, 1, -0.5806F);
        mMatrix.set(0, 2, 1.0F);
        mMatrix.set(1, 2, 2.03211F);
        mMatrix.set(2, 2, 0.0F);
        setMatrix();
    }
}
