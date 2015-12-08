// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            RenderScript, RSIllegalArgumentException, RSInvalidStateException, RenderScriptThunker, 
//            RSRuntimeException

public class BaseObj
{

    private boolean mDestroyed;
    private int mID;
    RenderScript mRS;

    BaseObj(int i, RenderScript renderscript)
    {
        renderscript.validate();
        mRS = renderscript;
        mID = i;
        mDestroyed = false;
    }

    void checkValid()
    {
        if (mID == 0 && getNObj() == null)
        {
            throw new RSIllegalArgumentException("Invalid object.");
        } else
        {
            return;
        }
    }

    public void destroy()
    {
        this;
        JVM INSTR monitorenter ;
        if (mDestroyed)
        {
            throw new RSInvalidStateException("Object already destroyed.");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        mDestroyed = true;
        mRS.nObjDestroy(mID);
        this;
        JVM INSTR monitorexit ;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (BaseObj)obj;
            if (mID != ((BaseObj) (obj)).mID)
            {
                return false;
            }
        }
        return true;
    }

    protected void finalize()
        throws Throwable
    {
        if (!mDestroyed)
        {
            if (mID != 0 && mRS.isAlive())
            {
                mRS.nObjDestroy(mID);
            }
            mRS = null;
            mID = 0;
            mDestroyed = true;
        }
        super.finalize();
    }

    int getID(RenderScript renderscript)
    {
        mRS.validate();
        if (RenderScript.isNative)
        {
            RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
            if (getNObj() != null)
            {
                return getNObj().hashCode();
            }
        }
        if (mDestroyed)
        {
            throw new RSInvalidStateException("using a destroyed object.");
        }
        if (mID == 0)
        {
            throw new RSRuntimeException("Internal error: Object id 0.");
        }
        if (renderscript != null && renderscript != mRS)
        {
            throw new RSInvalidStateException("using object with mismatched context.");
        } else
        {
            return mID;
        }
    }

    android.renderscript.BaseObj getNObj()
    {
        return null;
    }

    public int hashCode()
    {
        return mID;
    }

    void setID(int i)
    {
        if (mID != 0)
        {
            throw new RSRuntimeException("Internal Error, reset of object ID.");
        } else
        {
            mID = i;
            return;
        }
    }
}
