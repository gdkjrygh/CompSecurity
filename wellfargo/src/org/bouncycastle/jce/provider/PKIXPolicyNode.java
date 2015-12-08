// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PKIXPolicyNode
    implements PolicyNode
{

    protected List children;
    protected boolean critical;
    protected int depth;
    protected Set expectedPolicies;
    protected PolicyNode parent;
    protected Set policyQualifiers;
    protected String validPolicy;

    public PKIXPolicyNode(List list, int i, Set set, PolicyNode policynode, Set set1, String s, boolean flag)
    {
        children = list;
        depth = i;
        expectedPolicies = set;
        parent = policynode;
        policyQualifiers = set1;
        validPolicy = s;
        critical = flag;
    }

    public void addChild(PKIXPolicyNode pkixpolicynode)
    {
        children.add(pkixpolicynode);
        pkixpolicynode.setParent(this);
    }

    public Object clone()
    {
        return copy();
    }

    public PKIXPolicyNode copy()
    {
        Object obj = new HashSet();
        for (Iterator iterator = expectedPolicies.iterator(); iterator.hasNext(); ((Set) (obj)).add(new String((String)iterator.next()))) { }
        HashSet hashset = new HashSet();
        for (Iterator iterator2 = policyQualifiers.iterator(); iterator2.hasNext(); hashset.add(new String((String)iterator2.next()))) { }
        obj = new PKIXPolicyNode(new ArrayList(), depth, ((Set) (obj)), null, hashset, new String(validPolicy), critical);
        PKIXPolicyNode pkixpolicynode;
        for (Iterator iterator1 = children.iterator(); iterator1.hasNext(); ((PKIXPolicyNode) (obj)).addChild(pkixpolicynode))
        {
            pkixpolicynode = ((PKIXPolicyNode)iterator1.next()).copy();
            pkixpolicynode.setParent(((PKIXPolicyNode) (obj)));
        }

        return ((PKIXPolicyNode) (obj));
    }

    public Iterator getChildren()
    {
        return children.iterator();
    }

    public int getDepth()
    {
        return depth;
    }

    public Set getExpectedPolicies()
    {
        return expectedPolicies;
    }

    public PolicyNode getParent()
    {
        return parent;
    }

    public Set getPolicyQualifiers()
    {
        return policyQualifiers;
    }

    public String getValidPolicy()
    {
        return validPolicy;
    }

    public boolean hasChildren()
    {
        return !children.isEmpty();
    }

    public boolean isCritical()
    {
        return critical;
    }

    public void removeChild(PKIXPolicyNode pkixpolicynode)
    {
        children.remove(pkixpolicynode);
    }

    public void setCritical(boolean flag)
    {
        critical = flag;
    }

    public void setParent(PKIXPolicyNode pkixpolicynode)
    {
        parent = pkixpolicynode;
    }

    public String toString()
    {
        return toString("");
    }

    public String toString(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(s);
        stringbuffer.append(validPolicy);
        stringbuffer.append(" {\n");
        for (int i = 0; i < children.size(); i++)
        {
            stringbuffer.append(((PKIXPolicyNode)children.get(i)).toString((new StringBuilder()).append(s).append("    ").toString()));
        }

        stringbuffer.append(s);
        stringbuffer.append("}\n");
        return stringbuffer.toString();
    }
}
