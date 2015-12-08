// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.BaseObj;
import android.renderscript.RSRuntimeException;
import android.renderscript.Sampler;

// Referenced classes of package android.support.v8.renderscript:
//            Sampler, RenderScript, RenderScriptThunker, ExceptionThunker

class SamplerThunker extends android.support.v8.renderscript.Sampler
{
    public static class Builder
    {

        float mAniso;
        Sampler.Value mMag;
        Sampler.Value mMin;
        RenderScriptThunker mRS;
        Sampler.Value mWrapR;
        Sampler.Value mWrapS;
        Sampler.Value mWrapT;

        public android.support.v8.renderscript.Sampler create()
        {
            mRS.validate();
            SamplerThunker samplerthunker;
            try
            {
                Object obj = new android.renderscript.Sampler.Builder(mRS.mN);
                ((android.renderscript.Sampler.Builder) (obj)).setMinification(SamplerThunker.convertValue(mMin));
                ((android.renderscript.Sampler.Builder) (obj)).setMagnification(SamplerThunker.convertValue(mMag));
                ((android.renderscript.Sampler.Builder) (obj)).setWrapS(SamplerThunker.convertValue(mWrapS));
                ((android.renderscript.Sampler.Builder) (obj)).setWrapT(SamplerThunker.convertValue(mWrapT));
                ((android.renderscript.Sampler.Builder) (obj)).setAnisotropy(mAniso);
                obj = ((android.renderscript.Sampler.Builder) (obj)).create();
                samplerthunker = new SamplerThunker(0, mRS);
                samplerthunker.mMin = mMin;
                samplerthunker.mMag = mMag;
                samplerthunker.mWrapS = mWrapS;
                samplerthunker.mWrapT = mWrapT;
                samplerthunker.mWrapR = mWrapR;
                samplerthunker.mAniso = mAniso;
                samplerthunker.mN = ((Sampler) (obj));
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

        public void setMagnification(Sampler.Value value)
        {
            if (value == Sampler.Value.NEAREST || value == Sampler.Value.LINEAR)
            {
                mMag = value;
                return;
            } else
            {
                throw new IllegalArgumentException("Invalid value");
            }
        }

        public void setMinification(Sampler.Value value)
        {
            if (value == Sampler.Value.NEAREST || value == Sampler.Value.LINEAR || value == Sampler.Value.LINEAR_MIP_LINEAR || value == Sampler.Value.LINEAR_MIP_NEAREST)
            {
                mMin = value;
                return;
            } else
            {
                throw new IllegalArgumentException("Invalid value");
            }
        }

        public void setWrapS(Sampler.Value value)
        {
            if (value == Sampler.Value.WRAP || value == Sampler.Value.CLAMP || value == Sampler.Value.MIRRORED_REPEAT)
            {
                mWrapS = value;
                return;
            } else
            {
                throw new IllegalArgumentException("Invalid value");
            }
        }

        public void setWrapT(Sampler.Value value)
        {
            if (value == Sampler.Value.WRAP || value == Sampler.Value.CLAMP || value == Sampler.Value.MIRRORED_REPEAT)
            {
                mWrapT = value;
                return;
            } else
            {
                throw new IllegalArgumentException("Invalid value");
            }
        }

        public Builder(RenderScriptThunker renderscriptthunker)
        {
            mRS = renderscriptthunker;
            mMin = Sampler.Value.NEAREST;
            mMag = Sampler.Value.NEAREST;
            mWrapS = Sampler.Value.WRAP;
            mWrapT = Sampler.Value.WRAP;
            mWrapR = Sampler.Value.WRAP;
        }
    }


    Sampler mN;

    protected SamplerThunker(int i, RenderScript renderscript)
    {
        super(i, renderscript);
    }

    static android.renderscript.Sampler.Value convertValue(Sampler.Value value)
    {
        static class _cls1
        {

            static final int $SwitchMap$android$support$v8$renderscript$Sampler$Value[];

            static 
            {
                $SwitchMap$android$support$v8$renderscript$Sampler$Value = new int[Sampler.Value.values().length];
                try
                {
                    $SwitchMap$android$support$v8$renderscript$Sampler$Value[Sampler.Value.NEAREST.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$android$support$v8$renderscript$Sampler$Value[Sampler.Value.LINEAR.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$android$support$v8$renderscript$Sampler$Value[Sampler.Value.LINEAR_MIP_LINEAR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$android$support$v8$renderscript$Sampler$Value[Sampler.Value.LINEAR_MIP_NEAREST.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$android$support$v8$renderscript$Sampler$Value[Sampler.Value.WRAP.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$android$support$v8$renderscript$Sampler$Value[Sampler.Value.CLAMP.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$android$support$v8$renderscript$Sampler$Value[Sampler.Value.MIRRORED_REPEAT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.android.support.v8.renderscript.Sampler.Value[value.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return android.renderscript.Sampler.Value.NEAREST;

        case 2: // '\002'
            return android.renderscript.Sampler.Value.LINEAR;

        case 3: // '\003'
            return android.renderscript.Sampler.Value.LINEAR_MIP_LINEAR;

        case 4: // '\004'
            return android.renderscript.Sampler.Value.LINEAR_MIP_NEAREST;

        case 5: // '\005'
            return android.renderscript.Sampler.Value.WRAP;

        case 6: // '\006'
            return android.renderscript.Sampler.Value.CLAMP;

        case 7: // '\007'
            return android.renderscript.Sampler.Value.MIRRORED_REPEAT;
        }
    }

    BaseObj getNObj()
    {
        return mN;
    }
}
