// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import java.util.ArrayList;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptGroup, RenderScript, RSInvalidStateException, RSRuntimeException, 
//            Type, Script

public static final class mRS
{

    private int mKernelCount;
    private ArrayList mLines;
    private ArrayList mNodes;
    private RenderScript mRS;
    private uilder mT;

    private mRS findNode(mRS mrs)
    {
        for (int i = 0; i < mNodes.size(); i++)
        {
            mRS mrs1 = (mNodes)mNodes.get(i);
            for (int j = 0; j < mrs1.rnels.size(); j++)
            {
                if (mrs == mrs1.rnels.get(j))
                {
                    return mrs1;
                }
            }

        }

        return null;
    }

    private rnels findNode(Script script)
    {
        for (int i = 0; i < mNodes.size(); i++)
        {
            if (script == ((mNodes)mNodes.get(i)).ript)
            {
                return (ript)mNodes.get(i);
            }
        }

        return null;
    }

    private void mergeDAGs(int i, int j)
    {
        for (int k = 0; k < mNodes.size(); k++)
        {
            if (((mNodes)mNodes.get(k)).Number == j)
            {
                ((Number)mNodes.get(k)).Number = i;
            }
        }

    }

    private void validateCycle(Number number, Number number1)
    {
        for (int i = 0; i < number.tputs.size(); i++)
        {
            Object obj = (ine)number.tputs.get(i);
            if (((ine) (obj)).mToK != null)
            {
                ine ine = findNode(((ine) (obj)).mToK.ipt);
                if (ine.equals(number1))
                {
                    throw new RSInvalidStateException("Loops in group not allowed.");
                }
                validateCycle(ine, number1);
            }
            if (((ine) (obj)).mToF == null)
            {
                continue;
            }
            obj = findNode(((ine) (obj)).mToF.pt);
            if (obj.equals(number1))
            {
                throw new RSInvalidStateException("Loops in group not allowed.");
            }
            validateCycle(((validateCycle) (obj)), number1);
        }

    }

    private void validateDAG()
    {
        for (int i = 0; i < mNodes.size(); i++)
        {
            validateCycle validatecycle = (mNodes)mNodes.get(i);
            if (validatecycle.puts.size() != 0)
            {
                continue;
            }
            if (validatecycle.tputs.size() == 0 && mNodes.size() > 1)
            {
                throw new RSInvalidStateException("Groups cannot contain unconnected scripts");
            }
            validateDAGRecurse(validatecycle, i + 1);
        }

        int k = ((validateDAGRecurse)mNodes.get(0)).Number;
        for (int j = 0; j < mNodes.size(); j++)
        {
            if (((mNodes)mNodes.get(j)).Number != k)
            {
                throw new RSInvalidStateException("Multiple DAGs in group not allowed.");
            }
        }

    }

    private void validateDAGRecurse(ion ion, int i)
    {
        if (ion.Number != 0 && ion.Number != i)
        {
            mergeDAGs(ion.Number, i);
        } else
        {
            ion.Number = i;
            int j = 0;
            while (j < ion.tputs.size()) 
            {
                ine ine = (ine)ion.tputs.get(j);
                if (ine.mToK != null)
                {
                    validateDAGRecurse(findNode(ine.mToK.ipt), i);
                }
                if (ine.mToF != null)
                {
                    validateDAGRecurse(findNode(ine.mToF.pt), i);
                }
                j++;
            }
        }
    }

    public pt addConnection(Type type, pt pt, pt pt1)
    {
        if (mT != null)
        {
            mT.addConnection(type, pt, pt1);
            return this;
        }
        pt pt2 = findNode(pt);
        if (pt2 == null)
        {
            throw new RSInvalidStateException("From script not found.");
        }
        pt pt3 = findNode(pt1.pt);
        if (pt3 == null)
        {
            throw new RSInvalidStateException("To script not found.");
        } else
        {
            ine ine = new ine(type, pt, pt1);
            mLines.add(new ine(type, pt, pt1));
            pt2.tputs.add(ine);
            pt3.puts.add(ine);
            validateCycle(pt2, pt2);
            return this;
        }
    }

    public validateCycle addConnection(Type type, validateCycle validatecycle, validateCycle validatecycle1)
    {
        if (mT != null)
        {
            mT.addConnection(type, validatecycle, validatecycle1);
            return this;
        }
        validateCycle validatecycle2 = findNode(validatecycle);
        if (validatecycle2 == null)
        {
            throw new RSInvalidStateException("From script not found.");
        }
        validateCycle validatecycle3 = findNode(validatecycle1);
        if (validatecycle3 == null)
        {
            throw new RSInvalidStateException("To script not found.");
        } else
        {
            ine ine = new ine(type, validatecycle, validatecycle1);
            mLines.add(new ine(type, validatecycle, validatecycle1));
            validatecycle2.tputs.add(ine);
            validatecycle3.puts.add(ine);
            validateCycle(validatecycle2, validatecycle2);
            return this;
        }
    }

    public validateCycle addKernel(validateCycle validatecycle)
    {
        if (mT != null)
        {
            mT.addKernel(validatecycle);
        } else
        {
            if (mLines.size() != 0)
            {
                throw new RSInvalidStateException("Kernels may not be added once connections exist.");
            }
            if (findNode(validatecycle) == null)
            {
                mKernelCount = mKernelCount + 1;
                validateCycle validatecycle2 = findNode(validatecycle.ipt);
                validateCycle validatecycle1 = validatecycle2;
                if (validatecycle2 == null)
                {
                    validatecycle1 = new it>(validatecycle.ipt);
                    mNodes.add(validatecycle1);
                }
                validatecycle1.rnels.add(validatecycle);
                return this;
            }
        }
        return this;
    }

    public ScriptGroup create()
    {
        if (mT == null) goto _L2; else goto _L1
_L1:
        Object obj = mT.create();
_L4:
        return ((ScriptGroup) (obj));
_L2:
        if (mNodes.size() == 0)
        {
            throw new RSInvalidStateException("Empty script groups are not allowed");
        }
        for (int i = 0; i < mNodes.size(); i++)
        {
            ((mNodes)mNodes.get(i)).Number = 0;
        }

        validateDAG();
        ArrayList arraylist = new ArrayList();
        obj = new ArrayList();
        int ai[] = new int[mKernelCount];
        int i1 = 0;
        for (int j = 0; j < mNodes.size(); j++)
        {
            rnels rnels = (mNodes)mNodes.get(j);
            for (int j1 = 0; j1 < rnels.rnels.size();)
            {
                rnels rnels1 = (rnels)rnels.rnels.get(j1);
                ai[i1] = rnels1.D(mRS);
                boolean flag = false;
                boolean flag1 = false;
                for (int k1 = 0; k1 < rnels.puts.size(); k1++)
                {
                    if (((ine)rnels.puts.get(k1)).mToK == rnels1)
                    {
                        flag = true;
                    }
                }

                for (int l1 = 0; l1 < rnels.tputs.size(); l1++)
                {
                    if (((ine)rnels.tputs.get(l1)).mFrom == rnels1)
                    {
                        flag1 = true;
                    }
                }

                if (!flag)
                {
                    arraylist.add(new >(rnels1));
                }
                if (!flag1)
                {
                    ((ArrayList) (obj)).add(new >(rnels1));
                }
                j1++;
                i1++;
            }

        }

        if (i1 != mKernelCount)
        {
            throw new RSRuntimeException("Count mismatch, should not happen.");
        }
        int ai1[] = new int[mLines.size()];
        int ai2[] = new int[mLines.size()];
        int ai3[] = new int[mLines.size()];
        int ai4[] = new int[mLines.size()];
        for (int k = 0; k < mLines.size(); k++)
        {
            ine ine = (ine)mLines.get(k);
            ai1[k] = ine.mFrom.D(mRS);
            if (ine.mToK != null)
            {
                ai2[k] = ine.mToK.D(mRS);
            }
            if (ine.mToF != null)
            {
                ai3[k] = ine.mToF.(mRS);
            }
            ai4[k] = ine.mAllocationType.getID(mRS);
        }

        int l = mRS.nScriptGroupCreate(ai, ai1, ai2, ai3, ai4);
        if (l == 0)
        {
            throw new RSRuntimeException("Object creation error, should not happen.");
        }
        ScriptGroup scriptgroup = new ScriptGroup(l, mRS);
        scriptgroup.mOutputs = new [((ArrayList) (obj)).size()];
        for (l = 0; l < ((ArrayList) (obj)).size(); l++)
        {
            scriptgroup.mOutputs[l] = ()((ArrayList) (obj)).get(l);
        }

        scriptgroup.mInputs = new [arraylist.size()];
        l = 0;
        do
        {
            obj = scriptgroup;
            if (l >= arraylist.size())
            {
                continue;
            }
            scriptgroup.mInputs[l] = ()arraylist.get(l);
            l++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public uilder(RenderScript renderscript)
    {
        mNodes = new ArrayList();
        mLines = new ArrayList();
        if (RenderScript.isNative)
        {
            mT = new uilder(renderscript);
        }
        mRS = renderscript;
    }
}
