// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import java.util.ArrayList;

// Referenced classes of package android.support.v8.renderscript:
//            BaseObj, RenderScript, RSIllegalArgumentException, Allocation, 
//            RSInvalidStateException, RSRuntimeException, Type, Script

public class ScriptGroup extends BaseObj
{
    public static final class Builder
    {

        private int mKernelCount;
        private ArrayList mLines;
        private ArrayList mNodes;
        private RenderScript mRS;
        private ScriptGroupThunker.Builder mT;

        private Node findNode(Script.KernelID kernelid)
        {
            for (int i = 0; i < mNodes.size(); i++)
            {
                Node node = (Node)mNodes.get(i);
                for (int j = 0; j < node.mKernels.size(); j++)
                {
                    if (kernelid == node.mKernels.get(j))
                    {
                        return node;
                    }
                }

            }

            return null;
        }

        private Node findNode(Script script)
        {
            for (int i = 0; i < mNodes.size(); i++)
            {
                if (script == ((Node)mNodes.get(i)).mScript)
                {
                    return (Node)mNodes.get(i);
                }
            }

            return null;
        }

        private void mergeDAGs(int i, int j)
        {
            for (int k = 0; k < mNodes.size(); k++)
            {
                if (((Node)mNodes.get(k)).dagNumber == j)
                {
                    ((Node)mNodes.get(k)).dagNumber = i;
                }
            }

        }

        private void validateCycle(Node node, Node node1)
        {
            for (int i = 0; i < node.mOutputs.size(); i++)
            {
                Object obj = (ConnectLine)node.mOutputs.get(i);
                if (((ConnectLine) (obj)).mToK != null)
                {
                    Node node2 = findNode(((ConnectLine) (obj)).mToK.mScript);
                    if (node2.equals(node1))
                    {
                        throw new RSInvalidStateException("Loops in group not allowed.");
                    }
                    validateCycle(node2, node1);
                }
                if (((ConnectLine) (obj)).mToF == null)
                {
                    continue;
                }
                obj = findNode(((ConnectLine) (obj)).mToF.mScript);
                if (obj.equals(node1))
                {
                    throw new RSInvalidStateException("Loops in group not allowed.");
                }
                validateCycle(((Node) (obj)), node1);
            }

        }

        private void validateDAG()
        {
            for (int i = 0; i < mNodes.size(); i++)
            {
                Node node = (Node)mNodes.get(i);
                if (node.mInputs.size() != 0)
                {
                    continue;
                }
                if (node.mOutputs.size() == 0 && mNodes.size() > 1)
                {
                    throw new RSInvalidStateException("Groups cannot contain unconnected scripts");
                }
                validateDAGRecurse(node, i + 1);
            }

            int k = ((Node)mNodes.get(0)).dagNumber;
            for (int j = 0; j < mNodes.size(); j++)
            {
                if (((Node)mNodes.get(j)).dagNumber != k)
                {
                    throw new RSInvalidStateException("Multiple DAGs in group not allowed.");
                }
            }

        }

        private void validateDAGRecurse(Node node, int i)
        {
            if (node.dagNumber != 0 && node.dagNumber != i)
            {
                mergeDAGs(node.dagNumber, i);
            } else
            {
                node.dagNumber = i;
                int j = 0;
                while (j < node.mOutputs.size()) 
                {
                    ConnectLine connectline = (ConnectLine)node.mOutputs.get(j);
                    if (connectline.mToK != null)
                    {
                        validateDAGRecurse(findNode(connectline.mToK.mScript), i);
                    }
                    if (connectline.mToF != null)
                    {
                        validateDAGRecurse(findNode(connectline.mToF.mScript), i);
                    }
                    j++;
                }
            }
        }

        public Builder addConnection(Type type, Script.KernelID kernelid, Script.FieldID fieldid)
        {
            if (mT != null)
            {
                mT.addConnection(type, kernelid, fieldid);
                return this;
            }
            Node node = findNode(kernelid);
            if (node == null)
            {
                throw new RSInvalidStateException("From script not found.");
            }
            Node node1 = findNode(fieldid.mScript);
            if (node1 == null)
            {
                throw new RSInvalidStateException("To script not found.");
            } else
            {
                ConnectLine connectline = new ConnectLine(type, kernelid, fieldid);
                mLines.add(new ConnectLine(type, kernelid, fieldid));
                node.mOutputs.add(connectline);
                node1.mInputs.add(connectline);
                validateCycle(node, node);
                return this;
            }
        }

        public Builder addConnection(Type type, Script.KernelID kernelid, Script.KernelID kernelid1)
        {
            if (mT != null)
            {
                mT.addConnection(type, kernelid, kernelid1);
                return this;
            }
            Node node = findNode(kernelid);
            if (node == null)
            {
                throw new RSInvalidStateException("From script not found.");
            }
            Node node1 = findNode(kernelid1);
            if (node1 == null)
            {
                throw new RSInvalidStateException("To script not found.");
            } else
            {
                ConnectLine connectline = new ConnectLine(type, kernelid, kernelid1);
                mLines.add(new ConnectLine(type, kernelid, kernelid1));
                node.mOutputs.add(connectline);
                node1.mInputs.add(connectline);
                validateCycle(node, node);
                return this;
            }
        }

        public Builder addKernel(Script.KernelID kernelid)
        {
            if (mT != null)
            {
                mT.addKernel(kernelid);
            } else
            {
                if (mLines.size() != 0)
                {
                    throw new RSInvalidStateException("Kernels may not be added once connections exist.");
                }
                if (findNode(kernelid) == null)
                {
                    mKernelCount = mKernelCount + 1;
                    Node node1 = findNode(kernelid.mScript);
                    Node node = node1;
                    if (node1 == null)
                    {
                        node = new Node(kernelid.mScript);
                        mNodes.add(node);
                    }
                    node.mKernels.add(kernelid);
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
                ((Node)mNodes.get(i)).dagNumber = 0;
            }

            validateDAG();
            ArrayList arraylist = new ArrayList();
            obj = new ArrayList();
            int ai[] = new int[mKernelCount];
            int i1 = 0;
            for (int j = 0; j < mNodes.size(); j++)
            {
                Node node = (Node)mNodes.get(j);
                for (int j1 = 0; j1 < node.mKernels.size();)
                {
                    Script.KernelID kernelid = (Script.KernelID)node.mKernels.get(j1);
                    ai[i1] = kernelid.getID(mRS);
                    boolean flag = false;
                    boolean flag1 = false;
                    for (int k1 = 0; k1 < node.mInputs.size(); k1++)
                    {
                        if (((ConnectLine)node.mInputs.get(k1)).mToK == kernelid)
                        {
                            flag = true;
                        }
                    }

                    for (int l1 = 0; l1 < node.mOutputs.size(); l1++)
                    {
                        if (((ConnectLine)node.mOutputs.get(l1)).mFrom == kernelid)
                        {
                            flag1 = true;
                        }
                    }

                    if (!flag)
                    {
                        arraylist.add(new IO(kernelid));
                    }
                    if (!flag1)
                    {
                        ((ArrayList) (obj)).add(new IO(kernelid));
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
                ConnectLine connectline = (ConnectLine)mLines.get(k);
                ai1[k] = connectline.mFrom.getID(mRS);
                if (connectline.mToK != null)
                {
                    ai2[k] = connectline.mToK.getID(mRS);
                }
                if (connectline.mToF != null)
                {
                    ai3[k] = connectline.mToF.getID(mRS);
                }
                ai4[k] = connectline.mAllocationType.getID(mRS);
            }

            int l = mRS.nScriptGroupCreate(ai, ai1, ai2, ai3, ai4);
            if (l == 0)
            {
                throw new RSRuntimeException("Object creation error, should not happen.");
            }
            ScriptGroup scriptgroup = new ScriptGroup(l, mRS);
            scriptgroup.mOutputs = new IO[((ArrayList) (obj)).size()];
            for (l = 0; l < ((ArrayList) (obj)).size(); l++)
            {
                scriptgroup.mOutputs[l] = (IO)((ArrayList) (obj)).get(l);
            }

            scriptgroup.mInputs = new IO[arraylist.size()];
            l = 0;
            do
            {
                obj = scriptgroup;
                if (l >= arraylist.size())
                {
                    continue;
                }
                scriptgroup.mInputs[l] = (IO)arraylist.get(l);
                l++;
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public Builder(RenderScript renderscript)
        {
            mNodes = new ArrayList();
            mLines = new ArrayList();
            if (RenderScript.isNative)
            {
                mT = new ScriptGroupThunker.Builder(renderscript);
            }
            mRS = renderscript;
        }
    }

    static class ConnectLine
    {

        Type mAllocationType;
        Script.KernelID mFrom;
        Script.FieldID mToF;
        Script.KernelID mToK;

        ConnectLine(Type type, Script.KernelID kernelid, Script.FieldID fieldid)
        {
            mFrom = kernelid;
            mToF = fieldid;
            mAllocationType = type;
        }

        ConnectLine(Type type, Script.KernelID kernelid, Script.KernelID kernelid1)
        {
            mFrom = kernelid;
            mToK = kernelid1;
            mAllocationType = type;
        }
    }

    static class IO
    {

        Allocation mAllocation;
        Script.KernelID mKID;

        IO(Script.KernelID kernelid)
        {
            mKID = kernelid;
        }
    }

    static class Node
    {

        int dagNumber;
        ArrayList mInputs;
        ArrayList mKernels;
        Node mNext;
        ArrayList mOutputs;
        Script mScript;

        Node(Script script)
        {
            mKernels = new ArrayList();
            mInputs = new ArrayList();
            mOutputs = new ArrayList();
            mScript = script;
        }
    }


    IO mInputs[];
    IO mOutputs[];

    ScriptGroup(int i, RenderScript renderscript)
    {
        super(i, renderscript);
    }

    public void execute()
    {
        mRS.nScriptGroupExecute(getID(mRS));
    }

    public void setInput(Script.KernelID kernelid, Allocation allocation)
    {
        for (int i = 0; i < mInputs.length; i++)
        {
            if (mInputs[i].mKID == kernelid)
            {
                mInputs[i].mAllocation = allocation;
                mRS.nScriptGroupSetInput(getID(mRS), kernelid.getID(mRS), mRS.safeID(allocation));
                return;
            }
        }

        throw new RSIllegalArgumentException("Script not found");
    }

    public void setOutput(Script.KernelID kernelid, Allocation allocation)
    {
        for (int i = 0; i < mOutputs.length; i++)
        {
            if (mOutputs[i].mKID == kernelid)
            {
                mOutputs[i].mAllocation = allocation;
                mRS.nScriptGroupSetOutput(getID(mRS), kernelid.getID(mRS), mRS.safeID(allocation));
                return;
            }
        }

        throw new RSIllegalArgumentException("Script not found");
    }
}
