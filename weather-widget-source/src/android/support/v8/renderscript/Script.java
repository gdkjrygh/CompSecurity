// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.BaseObj;
import android.util.SparseArray;
import java.io.UnsupportedEncodingException;

// Referenced classes of package android.support.v8.renderscript:
//            BaseObj, ScriptCThunker, RenderScript, Allocation, 
//            RSDriverException, RSIllegalArgumentException, FieldPacker, Element, 
//            Type

public class Script extends android.support.v8.renderscript.BaseObj
{
    public static class Builder
    {

        RenderScript mRS;

        Builder(RenderScript renderscript)
        {
            mRS = renderscript;
        }
    }

    public static class FieldBase
    {

        protected Allocation mAllocation;
        protected Element mElement;

        public Allocation getAllocation()
        {
            return mAllocation;
        }

        public Element getElement()
        {
            return mElement;
        }

        public Type getType()
        {
            return mAllocation.getType();
        }

        protected void init(RenderScript renderscript, int i)
        {
            mAllocation = Allocation.createSized(renderscript, mElement, i, 1);
        }

        protected void init(RenderScript renderscript, int i, int j)
        {
            mAllocation = Allocation.createSized(renderscript, mElement, i, j | 1);
        }

        public void updateAllocation()
        {
        }

        protected FieldBase()
        {
        }
    }

    public static final class FieldID extends android.support.v8.renderscript.BaseObj
    {

        android.renderscript.FieldID mN;
        Script mScript;
        int mSlot;

        FieldID(int i, RenderScript renderscript, Script script, int j)
        {
            super(i, renderscript);
            mScript = script;
            mSlot = j;
        }
    }

    public static final class KernelID extends android.support.v8.renderscript.BaseObj
    {

        android.renderscript.KernelID mN;
        Script mScript;
        int mSig;
        int mSlot;

        KernelID(int i, RenderScript renderscript, Script script, int j, int k)
        {
            super(i, renderscript);
            mScript = script;
            mSlot = j;
            mSig = k;
        }
    }

    public static final class LaunchOptions
    {

        private int strategy;
        private int xend;
        private int xstart;
        private int yend;
        private int ystart;
        private int zend;
        private int zstart;

        public int getXEnd()
        {
            return xend;
        }

        public int getXStart()
        {
            return xstart;
        }

        public int getYEnd()
        {
            return yend;
        }

        public int getYStart()
        {
            return ystart;
        }

        public int getZEnd()
        {
            return zend;
        }

        public int getZStart()
        {
            return zstart;
        }

        public LaunchOptions setX(int i, int j)
        {
            if (i < 0 || j <= i)
            {
                throw new RSIllegalArgumentException("Invalid dimensions");
            } else
            {
                xstart = i;
                xend = j;
                return this;
            }
        }

        public LaunchOptions setY(int i, int j)
        {
            if (i < 0 || j <= i)
            {
                throw new RSIllegalArgumentException("Invalid dimensions");
            } else
            {
                ystart = i;
                yend = j;
                return this;
            }
        }

        public LaunchOptions setZ(int i, int j)
        {
            if (i < 0 || j <= i)
            {
                throw new RSIllegalArgumentException("Invalid dimensions");
            } else
            {
                zstart = i;
                zend = j;
                return this;
            }
        }







        public LaunchOptions()
        {
            xstart = 0;
            ystart = 0;
            xend = 0;
            yend = 0;
            zstart = 0;
            zend = 0;
        }
    }


    private final SparseArray mFIDs = new SparseArray();
    private final SparseArray mKIDs = new SparseArray();
    ScriptCThunker mT;

    Script(int i, RenderScript renderscript)
    {
        super(i, renderscript);
    }

    public void bindAllocation(Allocation allocation, int i)
    {
        if (mT != null)
        {
            mT.thunkBindAllocation(allocation, i);
            return;
        }
        mRS.validate();
        if (allocation != null)
        {
            mRS.nScriptBindAllocation(getID(mRS), allocation.getID(mRS), i);
            return;
        } else
        {
            mRS.nScriptBindAllocation(getID(mRS), 0, i);
            return;
        }
    }

    protected FieldID createFieldID(int i, Element element)
    {
        RenderScript renderscript = mRS;
        if (RenderScript.isNative)
        {
            FieldID fieldid = new FieldID(0, mRS, this, i);
            if (mT != null)
            {
                fieldid.mN = mT.thunkCreateFieldID(i, element);
            }
            mFIDs.put(i, fieldid);
            return fieldid;
        }
        element = (FieldID)mFIDs.get(i);
        if (element != null)
        {
            return element;
        }
        int j = mRS.nScriptFieldIDCreate(getID(mRS), i);
        if (j == 0)
        {
            throw new RSDriverException("Failed to create FieldID");
        } else
        {
            element = new FieldID(j, mRS, this, i);
            mFIDs.put(i, element);
            return element;
        }
    }

    protected KernelID createKernelID(int i, int j, Element element, Element element1)
    {
        Object obj = (KernelID)mKIDs.get(i);
        if (obj != null)
        {
            return ((KernelID) (obj));
        }
        obj = mRS;
        if (RenderScript.isNative)
        {
            KernelID kernelid = new KernelID(0, mRS, this, i, j);
            if (mT != null)
            {
                kernelid.mN = mT.thunkCreateKernelID(i, j, element, element1);
            }
            mKIDs.put(i, kernelid);
            return kernelid;
        }
        int k = mRS.nScriptKernelIDCreate(getID(mRS), i, j);
        if (k == 0)
        {
            throw new RSDriverException("Failed to create KernelID");
        } else
        {
            element = new KernelID(k, mRS, this, i, j);
            mKIDs.put(i, element);
            return element;
        }
    }

    protected void forEach(int i, Allocation allocation, Allocation allocation1, FieldPacker fieldpacker)
    {
        if (mT != null)
        {
            mT.thunkForEach(i, allocation, allocation1, fieldpacker);
            return;
        }
        if (allocation == null && allocation1 == null)
        {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        int j = 0;
        if (allocation != null)
        {
            j = allocation.getID(mRS);
        }
        int k = 0;
        if (allocation1 != null)
        {
            k = allocation1.getID(mRS);
        }
        allocation = null;
        if (fieldpacker != null)
        {
            allocation = fieldpacker.getData();
        }
        mRS.nScriptForEach(getID(mRS), i, j, k, allocation);
    }

    protected void forEach(int i, Allocation allocation, Allocation allocation1, FieldPacker fieldpacker, LaunchOptions launchoptions)
    {
        if (mT != null)
        {
            mT.thunkForEach(i, allocation, allocation1, fieldpacker, launchoptions);
            return;
        }
        if (allocation == null && allocation1 == null)
        {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        if (launchoptions == null)
        {
            forEach(i, allocation, allocation1, fieldpacker);
            return;
        }
        int j = 0;
        if (allocation != null)
        {
            j = allocation.getID(mRS);
        }
        int k = 0;
        if (allocation1 != null)
        {
            k = allocation1.getID(mRS);
        }
        allocation = null;
        if (fieldpacker != null)
        {
            allocation = fieldpacker.getData();
        }
        mRS.nScriptForEachClipped(getID(mRS), i, j, k, allocation, launchoptions.xstart, launchoptions.xend, launchoptions.ystart, launchoptions.yend, launchoptions.zstart, launchoptions.zend);
    }

    volatile BaseObj getNObj()
    {
        return getNObj();
    }

    android.renderscript.Script getNObj()
    {
        return mT;
    }

    protected void invoke(int i)
    {
        if (mT != null)
        {
            mT.thunkInvoke(i);
            return;
        } else
        {
            mRS.nScriptInvoke(getID(mRS), i);
            return;
        }
    }

    protected void invoke(int i, FieldPacker fieldpacker)
    {
        if (mT != null)
        {
            mT.thunkInvoke(i, fieldpacker);
            return;
        }
        if (fieldpacker != null)
        {
            mRS.nScriptInvokeV(getID(mRS), i, fieldpacker.getData());
            return;
        } else
        {
            mRS.nScriptInvoke(getID(mRS), i);
            return;
        }
    }

    public void setTimeZone(String s)
    {
        if (mT != null)
        {
            mT.thunkSetTimeZone(s);
            return;
        }
        mRS.validate();
        try
        {
            mRS.nScriptSetTimeZone(getID(mRS), s.getBytes("UTF-8"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
    }

    public void setVar(int i, double d)
    {
        if (mT != null)
        {
            mT.thunkSetVar(i, d);
            return;
        } else
        {
            mRS.nScriptSetVarD(getID(mRS), i, d);
            return;
        }
    }

    public void setVar(int i, float f)
    {
        if (mT != null)
        {
            mT.thunkSetVar(i, f);
            return;
        } else
        {
            mRS.nScriptSetVarF(getID(mRS), i, f);
            return;
        }
    }

    public void setVar(int i, int j)
    {
        if (mT != null)
        {
            mT.thunkSetVar(i, j);
            return;
        } else
        {
            mRS.nScriptSetVarI(getID(mRS), i, j);
            return;
        }
    }

    public void setVar(int i, long l)
    {
        if (mT != null)
        {
            mT.thunkSetVar(i, l);
            return;
        } else
        {
            mRS.nScriptSetVarJ(getID(mRS), i, l);
            return;
        }
    }

    public void setVar(int i, android.support.v8.renderscript.BaseObj baseobj)
    {
        if (mT != null)
        {
            mT.thunkSetVar(i, baseobj);
            return;
        }
        RenderScript renderscript = mRS;
        int k = getID(mRS);
        int j;
        if (baseobj == null)
        {
            j = 0;
        } else
        {
            j = baseobj.getID(mRS);
        }
        renderscript.nScriptSetVarObj(k, i, j);
    }

    public void setVar(int i, FieldPacker fieldpacker)
    {
        if (mT != null)
        {
            mT.thunkSetVar(i, fieldpacker);
            return;
        } else
        {
            mRS.nScriptSetVarV(getID(mRS), i, fieldpacker.getData());
            return;
        }
    }

    public void setVar(int i, FieldPacker fieldpacker, Element element, int ai[])
    {
        if (mT != null)
        {
            mT.thunkSetVar(i, fieldpacker, element, ai);
            return;
        } else
        {
            mRS.nScriptSetVarVE(getID(mRS), i, fieldpacker.getData(), element.getID(mRS), ai);
            return;
        }
    }

    public void setVar(int i, boolean flag)
    {
        if (mT != null)
        {
            mT.thunkSetVar(i, flag);
            return;
        }
        RenderScript renderscript = mRS;
        int k = getID(mRS);
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        renderscript.nScriptSetVarI(k, i, j);
    }
}
