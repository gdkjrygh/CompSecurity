// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.RSRuntimeException;

// Referenced classes of package android.support.v8.renderscript:
//            SamplerThunker, RenderScriptThunker, ExceptionThunker, Sampler

public static class mWrapR
{

    float mAniso;
    mWrapT mMag;
    mWrapT mMin;
    RenderScriptThunker mRS;
    mWrapT mWrapR;
    mWrapT mWrapS;
    mWrapT mWrapT;

    public Sampler create()
    {
        mRS.validate();
        SamplerThunker samplerthunker;
        try
        {
            Object obj = new android.renderscript.Thunker.validate(mRS.mN);
            ((android.renderscript.Thunker.mN) (obj)).fication(SamplerThunker.convertValue(mMin));
            ((android.renderscript.er.Builder.mMin) (obj)).ification(SamplerThunker.convertValue(mMag));
            ((android.renderscript.er.Builder.mMag) (obj)).S(SamplerThunker.convertValue(mWrapS));
            ((android.renderscript.er.Builder.mWrapS) (obj)).T(SamplerThunker.convertValue(mWrapT));
            ((android.renderscript.er.Builder.mWrapT) (obj)).otropy(mAniso);
            obj = ((android.renderscript.er.Builder.mAniso) (obj)).mAniso();
            samplerthunker = new SamplerThunker(0, mRS);
            samplerthunker.mMin = mMin;
            samplerthunker.mMag = mMag;
            samplerthunker.mWrapS = mWrapS;
            samplerthunker.mWrapT = mWrapT;
            samplerthunker.mWrapR = mWrapR;
            samplerthunker.mAniso = mAniso;
            samplerthunker.mN = ((android.renderscript.Sampler) (obj));
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return samplerthunker;
    }

    public void setAnisotropy(float f)
    {
        if (f >= 0.0F)
        {
            mAniso = f;
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public void setMagnification(mAniso maniso)
    {
        if (maniso == mAniso || maniso == mAniso)
        {
            mMag = maniso;
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public void setMinification(mMag mmag)
    {
        if (mmag == mMag || mmag == mMag || mmag == P_LINEAR || mmag == P_NEAREST)
        {
            mMin = mmag;
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public void setWrapS(mMin mmin)
    {
        if (mmin == mMin || mmin == mMin || mmin == REPEAT)
        {
            mWrapS = mmin;
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public void setWrapT(mWrapS mwraps)
    {
        if (mwraps == mWrapS || mwraps == mWrapS || mwraps == REPEAT)
        {
            mWrapT = mwraps;
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public (RenderScriptThunker renderscriptthunker)
    {
        mRS = renderscriptthunker;
        mMin = mMin;
        mMag = mMag;
        mWrapS = mWrapS;
        mWrapT = mWrapT;
        mWrapR = mWrapR;
    }
}
