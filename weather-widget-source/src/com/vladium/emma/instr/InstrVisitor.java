// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.emma.IAppConstants;
import com.vladium.emma.data.ClassDescriptor;
import com.vladium.emma.data.CoverageOptions;
import com.vladium.emma.data.MethodDescriptor;
import com.vladium.jcd.cls.AbstractClassDefVisitor;
import com.vladium.jcd.cls.ClassDef;
import com.vladium.jcd.cls.ElementFactory;
import com.vladium.jcd.cls.Field_info;
import com.vladium.jcd.cls.IAttributeCollection;
import com.vladium.jcd.cls.IClassDefVisitor;
import com.vladium.jcd.cls.IConstantCollection;
import com.vladium.jcd.cls.IFieldCollection;
import com.vladium.jcd.cls.IInterfaceCollection;
import com.vladium.jcd.cls.IMethodCollection;
import com.vladium.jcd.cls.Method_info;
import com.vladium.jcd.cls.attribute.AttributeElementFactory;
import com.vladium.jcd.cls.attribute.Attribute_info;
import com.vladium.jcd.cls.attribute.BridgeAttribute_info;
import com.vladium.jcd.cls.attribute.CodeAttribute_info;
import com.vladium.jcd.cls.attribute.ConstantValueAttribute_info;
import com.vladium.jcd.cls.attribute.Exception_info;
import com.vladium.jcd.cls.attribute.ExceptionsAttribute_info;
import com.vladium.jcd.cls.attribute.GenericAttribute_info;
import com.vladium.jcd.cls.attribute.IAttributeVisitor;
import com.vladium.jcd.cls.attribute.IExceptionHandlerTable;
import com.vladium.jcd.cls.attribute.InnerClassesAttribute_info;
import com.vladium.jcd.cls.attribute.LineNumberTableAttribute_info;
import com.vladium.jcd.cls.attribute.LineNumber_info;
import com.vladium.jcd.cls.attribute.SourceFileAttribute_info;
import com.vladium.jcd.cls.attribute.SyntheticAttribute_info;
import com.vladium.jcd.cls.constant.CONSTANT_Class_info;
import com.vladium.jcd.cls.constant.CONSTANT_Long_info;
import com.vladium.jcd.cls.constant.CONSTANT_Methodref_info;
import com.vladium.jcd.cls.constant.CONSTANT_String_info;
import com.vladium.jcd.cls.constant.CONSTANT_Utf8_info;
import com.vladium.jcd.compiler.CodeGen;
import com.vladium.jcd.lib.Types;
import com.vladium.jcd.opcodes.IOpcodes;
import com.vladium.logging.Logger;
import com.vladium.util.ByteArrayOStream;
import com.vladium.util.IConstants;
import com.vladium.util.IntIntMap;
import com.vladium.util.IntObjectMap;
import com.vladium.util.IntSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class InstrVisitor extends AbstractClassDefVisitor
    implements IClassDefVisitor, IAttributeVisitor, IOpcodes, IConstants
{
    private static final class Block
    {

        public Branch m_branch;
        int m_first;
        public CodeSegment m_insertion;
        int m_instrCount;
        int m_length;

        void emit(EmitCtx emitctx, byte abyte0[])
        {
            ByteArrayOStream bytearrayostream = emitctx.m_out;
            int j = m_first;
            m_first = bytearrayostream.size();
            int i = 0;
            for (int k = m_length; i < k; i++)
            {
                bytearrayostream.write(abyte0[j + i]);
            }

            if (m_insertion != null)
            {
                m_insertion.emit(emitctx);
            }
            if (m_branch != null)
            {
                m_branch.emit(emitctx);
            }
        }

        private Block()
        {
        }

    }

    private static final class BlockList
    {

        final List m_blocks;
        CodeSegment m_header;

        BlockList()
        {
            m_blocks = new ArrayList();
        }

        BlockList(int i)
        {
            m_blocks = new ArrayList(i);
        }
    }

    static final class BlockSegment extends CodeSegment
    {

        private static final int BLOCK_INIT_CAPACITY = 16;
        private final ByteArrayOStream m_buf;

        void emit(EmitCtx emitctx)
        {
            try
            {
                m_buf.writeTo(emitctx.m_out);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (EmitCtx emitctx)
            {
                return;
            }
        }

        int length()
        {
            return m_buf.size();
        }

        int maxstack()
        {
            return 3;
        }

        public BlockSegment(InstrVisitor instrvisitor, int i, int j)
        {
            super(instrvisitor);
            ByteArrayOStream bytearrayostream = new ByteArrayOStream(16);
            m_buf = bytearrayostream;
            instrvisitor = instrvisitor.m_cls;
            CodeGen.load_local_object_var(bytearrayostream, i);
            CodeGen.push_int_value(bytearrayostream, instrvisitor, j);
            bytearrayostream.write2(4, 84);
        }
    }

    static abstract class Branch
    {

        final byte m_opcode;
        int m_parentBlockID;
        final int m_targets[];

        abstract void emit(EmitCtx emitctx);

        protected final void emitJumpOffset2(EmitCtx emitctx, int i, int j)
        {
            ByteArrayOStream bytearrayostream = emitctx.m_out;
            if (j <= m_parentBlockID)
            {
                i = ((Block)emitctx.m_blocks.m_blocks.get(j)).m_first - i;
                bytearrayostream.write2(i >>> 8, i);
                return;
            } else
            {
                int k = bytearrayostream.size();
                bytearrayostream.write2(0, 0);
                emitctx.m_backpatchQueue.add(new int[] {
                    2, k, i, j
                });
                return;
            }
        }

        protected final void emitJumpOffset4(EmitCtx emitctx, int i, int j)
        {
            ByteArrayOStream bytearrayostream = emitctx.m_out;
            if (j <= m_parentBlockID)
            {
                i = ((Block)emitctx.m_blocks.m_blocks.get(j)).m_first - i;
                bytearrayostream.write4(i >>> 24, i >>> 16, i >>> 8, i);
                return;
            } else
            {
                int k = bytearrayostream.size();
                bytearrayostream.write4(0, 0, 0, 0);
                emitctx.m_backpatchQueue.add(new int[] {
                    4, k, i, j
                });
                return;
            }
        }

        int maxlength()
        {
            return 1;
        }

        protected Branch(int i, int ai[])
        {
            m_opcode = (byte)i;
            m_targets = ai;
        }
    }

    static abstract class CodeSegment
    {

        final InstrVisitor m_visitor;

        abstract void emit(EmitCtx emitctx);

        abstract int length();

        abstract int maxstack();

        CodeSegment(InstrVisitor instrvisitor)
        {
            m_visitor = instrvisitor;
        }
    }

    static final class EmitCtx
    {

        final List m_backpatchQueue = new ArrayList();
        final BlockList m_blocks;
        final ByteArrayOStream m_out;

        EmitCtx(BlockList blocklist, ByteArrayOStream bytearrayostream)
        {
            m_blocks = blocklist;
            m_out = bytearrayostream;
        }
    }

    static final class IFJUMP2 extends Branch
    {

        void emit(EmitCtx emitctx)
        {
            ByteArrayOStream bytearrayostream = emitctx.m_out;
            int i = m_targets[0];
            int j = bytearrayostream.size();
            bytearrayostream.write(m_opcode);
            emitJumpOffset2(emitctx, j, i);
        }

        int maxlength()
        {
            return 8;
        }

        IFJUMP2(int i, int j)
        {
            super(i, new int[] {
                j
            });
        }
    }

    public static final class InstrResult
    {

        public ClassDescriptor m_descriptor;
        public boolean m_instrumented;

        public InstrResult()
        {
        }
    }

    static final class JUMP2 extends Branch
    {

        void emit(EmitCtx emitctx)
        {
            ByteArrayOStream bytearrayostream = emitctx.m_out;
            int i = m_targets[0];
            int j = bytearrayostream.size();
            bytearrayostream.write(m_opcode);
            emitJumpOffset2(emitctx, j, i);
        }

        int maxlength()
        {
            return 5;
        }

        JUMP2(int i, int j)
        {
            super(i, new int[] {
                j
            });
        }
    }

    static final class JUMP4 extends Branch
    {

        void emit(EmitCtx emitctx)
        {
            ByteArrayOStream bytearrayostream = emitctx.m_out;
            int i = m_targets[0];
            int j = bytearrayostream.size();
            bytearrayostream.write(m_opcode);
            emitJumpOffset4(emitctx, j, i);
        }

        int maxlength()
        {
            return 5;
        }

        JUMP4(int i, int j)
        {
            super(i, new int[] {
                j
            });
        }
    }

    static final class LOOKUPSWITCH extends Branch
    {

        final int m_keys[];

        void emit(EmitCtx emitctx)
        {
            ByteArrayOStream bytearrayostream = emitctx.m_out;
            int l = bytearrayostream.size();
            bytearrayostream.write(m_opcode);
            for (int i = 0; i < 3 - (l & 3); i++)
            {
                bytearrayostream.write(0);
            }

            emitJumpOffset4(emitctx, l, m_targets[0]);
            int j = m_keys.length;
            bytearrayostream.write4(j >>> 24, j >>> 16, j >>> 8, j);
            for (int k = 1; k < m_targets.length; k++)
            {
                int i1 = m_keys[k - 1];
                bytearrayostream.write4(i1 >>> 24, i1 >>> 16, i1 >>> 8, i1);
                emitJumpOffset4(emitctx, l, m_targets[k]);
            }

        }

        int maxlength()
        {
            return (m_keys.length << 3) + 12;
        }

        LOOKUPSWITCH(int ai[], int ai1[])
        {
            super(171, ai1);
            m_keys = ai;
        }
    }

    private static final class LineNumberComparator
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            return ((LineNumber_info)obj).m_start_pc - ((LineNumber_info)obj1).m_start_pc;
        }

        private LineNumberComparator()
        {
        }

    }

    static final class RET extends Branch
    {

        final int m_varindex;

        void emit(EmitCtx emitctx)
        {
            emitctx = emitctx.m_out;
            if (m_varindex <= 255)
            {
                emitctx.write2(m_opcode, m_varindex);
                return;
            } else
            {
                emitctx.write4(196, m_opcode, m_varindex >>> 8, m_varindex);
                return;
            }
        }

        int length()
        {
            return m_varindex > 255 ? 3 : 2;
        }

        RET(int i, int j)
        {
            super(i, null);
            m_varindex = j;
        }
    }

    static final class TABLESWITCH extends Branch
    {

        final int m_high;
        final int m_low;

        void emit(EmitCtx emitctx)
        {
            ByteArrayOStream bytearrayostream = emitctx.m_out;
            int l = bytearrayostream.size();
            bytearrayostream.write(m_opcode);
            for (int i = 0; i < 3 - (l & 3); i++)
            {
                bytearrayostream.write(0);
            }

            emitJumpOffset4(emitctx, l, m_targets[0]);
            int j = m_low;
            bytearrayostream.write4(j >>> 24, j >>> 16, j >>> 8, j);
            j = m_high;
            bytearrayostream.write4(j >>> 24, j >>> 16, j >>> 8, j);
            for (int k = 1; k < m_targets.length; k++)
            {
                emitJumpOffset4(emitctx, l, m_targets[k]);
            }

        }

        int maxlength()
        {
            return (m_targets.length << 2) + 12;
        }

        TABLESWITCH(int i, int j, int ai[])
        {
            super(170, ai);
            m_low = i;
            m_high = j;
        }
    }

    static final class TERMINATE extends Branch
    {

        void emit(EmitCtx emitctx)
        {
            emitctx.m_out.write(m_opcode);
        }

        int length()
        {
            return 1;
        }

        TERMINATE(int i)
        {
            super(i, null);
        }
    }

    static final class clinitHeader extends CodeSegment
    {

        private static final int CLINIT_HEADER_INIT_CAPACITY = 32;
        private final ByteArrayOStream m_buf;

        void emit(EmitCtx emitctx)
        {
            try
            {
                m_buf.writeTo(emitctx.m_out);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (EmitCtx emitctx)
            {
                return;
            }
        }

        int length()
        {
            return m_buf.size();
        }

        int maxstack()
        {
            return 2;
        }

        clinitHeader(InstrVisitor instrvisitor, int i)
        {
            super(instrvisitor);
            ByteArrayOStream bytearrayostream = new ByteArrayOStream(32);
            m_buf = bytearrayostream;
            ClassDef classdef = instrvisitor.m_cls;
            int ai[] = instrvisitor.m_classBlockCounts;
            int j = instrvisitor.m_classInstrMethodCount;
            j = instrvisitor.m_coverageFieldrefIndex;
            j = instrvisitor.m_preclinitMethodrefIndex;
            int k = instrvisitor.m_classNameConstantIndex;
            bytearrayostream.write3(184, j >>> 8, j);
            CodeGen.push_int_value(bytearrayostream, classdef, instrvisitor.m_methodID);
            bytearrayostream.write(50);
            CodeGen.store_local_object_var(bytearrayostream, i);
        }
    }

    static final class methodHeader extends CodeSegment
    {

        private static final int HEADER_INIT_CAPACITY = 16;
        private final ByteArrayOStream m_buf;

        void emit(EmitCtx emitctx)
        {
            try
            {
                m_buf.writeTo(emitctx.m_out);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (EmitCtx emitctx)
            {
                return;
            }
        }

        int length()
        {
            return m_buf.size();
        }

        int maxstack()
        {
            return 2;
        }

        methodHeader(InstrVisitor instrvisitor, int i)
        {
            super(instrvisitor);
            ByteArrayOStream bytearrayostream = new ByteArrayOStream(16);
            m_buf = bytearrayostream;
            ClassDef classdef = instrvisitor.m_cls;
            int j = instrvisitor.m_coverageFieldrefIndex;
            int k = instrvisitor.m_preclinitMethodrefIndex;
            bytearrayostream.write4(178, j >>> 8, j, 89);
            bytearrayostream.write3(199, 0, 7);
            bytearrayostream.write4(87, 184, k >>> 8, k);
            CodeGen.push_int_value(bytearrayostream, classdef, instrvisitor.m_methodID);
            bytearrayostream.write(50);
            CodeGen.store_local_object_var(bytearrayostream, i);
        }
    }


    private static final String COVERAGE_FIELD_NAME = "$VRc";
    private static final int EMIT_CTX_MIN_INIT_CAPACITY = 64;
    private static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
    private static final String JAVA_IO_EXTERNALIZABLE_NAME = "java/io/Externalizable";
    private static final String JAVA_IO_SERIALIZABLE_NAME = "java/io/Serializable";
    private static final LineNumberComparator LINE_NUMBER_COMPARATOR = new LineNumberComparator();
    private static final boolean MARK_ADDED_ELEMENTS_SYNTHETIC = true;
    private static final long NBEAST = 16661L;
    private static final int PRECLINIT_INIT_CAPACITY = 128;
    private static final String PRECLINIT_METHOD_NAME = "$VRi";
    private static final boolean SKIP_SYNTHETIC_CLASSES = false;
    private static final String SUID_FIELD_NAME = "serialVersionUID";
    int m_classBlockCounts[];
    private int m_classBlockMetadata[][][];
    int m_classInstrMethodCount;
    private MethodDescriptor m_classMethodDescriptors[];
    private String m_className;
    int m_classNameConstantIndex;
    private String m_classPackageName;
    private long m_classSignature;
    private String m_classSrcFileName;
    private int m_clinitID;
    private int m_clinitStatus;
    ClassDef m_cls;
    int m_coverageFieldrefIndex;
    private final boolean m_doSUIDCompensation;
    private final boolean m_excludeBridgeMethods;
    private final boolean m_excludeSyntheticMethods;
    private boolean m_ignoreAlreadyInstrumented;
    private boolean m_instrument;
    private final Logger m_log = Logger.getLogger();
    private boolean m_metadata;
    private int m_methodBlockOffsets[];
    private int m_methodBlockSizes[];
    private int m_methodFirstLine;
    int m_methodID;
    private int m_methodJumpAdjOffsets[];
    private int m_methodJumpAdjValues[];
    private String m_methodName;
    int m_preclinitMethodrefIndex;
    private int m_registerMethodrefIndex;
    private int m_stampIndex;
    private int m_syntheticStringIndex;
    private boolean m_warningIssued;

    public InstrVisitor(CoverageOptions coverageoptions)
    {
        m_excludeSyntheticMethods = coverageoptions.excludeSyntheticMethods();
        m_excludeBridgeMethods = coverageoptions.excludeBridgeMethods();
        m_doSUIDCompensation = coverageoptions.doSUIDCompensation();
    }

    private void consumeSignatureData(int i, int ai[])
    {
        int j = ai.length;
        long l = m_classSignature * 16661L + (long)((i + 1) * j);
        for (i = 1; i < j; i++)
        {
            l = 16661L * l + (long)ai[i];
        }

        m_classSignature = l;
    }

    private static int lowbound(int ai[], int i)
    {
        int j = 0;
        int k;
        for (k = ai.length - 1; j <= k;)
        {
            int l = j + k >> 1;
            int i1 = ai[l];
            if (i1 == i)
            {
                return l;
            }
            if (i1 < i)
            {
                j = l + 1;
            } else
            {
                k = l - 1;
            }
        }

        return k;
    }

    private void reset()
    {
        m_instrument = false;
        m_metadata = false;
        m_ignoreAlreadyInstrumented = false;
        m_cls = null;
        m_classPackageName = null;
        m_className = null;
        m_classSrcFileName = null;
        m_classBlockMetadata = (int[][][])null;
        m_classMethodDescriptors = null;
        m_syntheticStringIndex = -1;
        m_coverageFieldrefIndex = -1;
        m_registerMethodrefIndex = -1;
        m_preclinitMethodrefIndex = -1;
        m_classNameConstantIndex = -1;
        m_clinitID = -1;
        m_clinitStatus = 0;
        m_classInstrMethodCount = -1;
        m_classBlockCounts = null;
        m_classSignature = 0L;
        m_methodID = -1;
        m_methodName = null;
        m_methodFirstLine = 0;
        m_methodBlockOffsets = null;
        m_methodJumpAdjOffsets = null;
        m_methodJumpAdjValues = null;
    }

    private void setClassName(String s)
    {
        int i = s.lastIndexOf('/');
        if (i < 0)
        {
            m_classPackageName = "";
            m_className = s;
            return;
        } else
        {
            m_classPackageName = s.substring(0, i);
            m_className = s.substring(i + 1);
            return;
        }
    }

    public void process(ClassDef classdef, boolean flag, boolean flag1, boolean flag2, InstrResult instrresult)
    {
        instrresult.m_instrumented = false;
        for (instrresult.m_descriptor = null; !flag1 && !flag2 || classdef.isInterface();)
        {
            return;
        }

        reset();
        m_cls = classdef;
        m_instrument = flag1;
        m_metadata = flag2;
        m_ignoreAlreadyInstrumented = flag;
        visit((ClassDef)null, null);
        if (m_metadata)
        {
            setClassName(classdef.getName());
            instrresult.m_descriptor = new ClassDescriptor(m_classPackageName, m_className, m_classSignature, m_classSrcFileName, m_classMethodDescriptors);
        }
        instrresult.m_instrumented = m_instrument;
    }

    public Object visit(ClassDef classdef, Object obj)
    {
        Object obj1;
        ClassDef classdef1;
        IConstantCollection iconstantcollection;
        classdef1 = m_cls;
        obj1 = classdef1.getName();
        classdef = Types.vmNameToJavaName(((String) (obj1)));
        boolean flag1 = m_log.atTRACE1();
        if (flag1)
        {
            m_log.trace1("visit", (new StringBuilder()).append("class: [").append(((String) (obj1))).append("]").toString());
        }
        if (!m_warningIssued && classdef.startsWith(IAppConstants.APP_PACKAGE))
        {
            m_warningIssued = true;
            m_log.warning("EMMA classes appear to be included on the instrumentation");
            m_log.warning("path: this is not a correct way to use EMMA");
        }
        if (classdef1.getFields("$VRc").length > 0)
        {
            m_instrument = false;
            m_metadata = false;
            if (m_ignoreAlreadyInstrumented)
            {
                if (flag1)
                {
                    m_log.trace1("visit", "skipping instrumented class");
                }
                return obj;
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("class [").append(classdef).append("] appears to be instrumented already").toString());
            }
        }
        iconstantcollection = classdef1.getConstants();
        m_syntheticStringIndex = classdef1.addCONSTANT_Utf8("Synthetic", true);
        IAttributeCollection iattributecollection = ElementFactory.newAttributeCollection(1);
        obj1 = new SyntheticAttribute_info(m_syntheticStringIndex);
        iattributecollection.add(((Attribute_info) (obj1)));
        m_coverageFieldrefIndex = classdef1.addFieldref(classdef1.addField("$VRc", "[[Z", 26, iattributecollection));
        m_registerMethodrefIndex = iconstantcollection.add(new CONSTANT_Methodref_info(classdef1.addClassref("com/vladium/emma/rt/RT"), classdef1.addNameType("r", "([[ZLjava/lang/String;J)V")));
        int i = classdef1.addNameType("$VRi", "()[[Z");
        m_preclinitMethodrefIndex = iconstantcollection.add(new CONSTANT_Methodref_info(classdef1.getThisClassIndex(), i));
        m_classNameConstantIndex = iconstantcollection.add(new CONSTANT_String_info(classdef1.getThisClass().m_name_index));
        visit(classdef1.getMethods(), obj);
        if (!m_doSUIDCompensation) goto _L2; else goto _L1
_L1:
        int k;
        int ai[];
        Object obj2;
        Object obj3;
        int j;
        boolean flag;
        int l;
        int i1;
        int j1;
        if ((m_clinitStatus & 8) != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        l = 0;
        k = j;
        if (j == 0) goto _L4; else goto _L3
_L3:
        ai = classdef1.getFields("serialVersionUID");
        i1 = ai.length;
        flag = j;
        if (i1 <= 0) goto _L6; else goto _L5
_L5:
        obj3 = classdef1.getFields();
        k = 0;
_L12:
        flag = j;
        if (k >= i1) goto _L6; else goto _L7
_L7:
        if ((((IFieldCollection) (obj3)).get(ai[k]).getAccessFlags() & 0x18) != 24) goto _L9; else goto _L8
_L8:
        flag = false;
_L6:
        k = ((flag) ? 1 : 0);
        l = i1;
        if (!flag) goto _L4; else goto _L10
_L10:
        k = ((flag) ? 1 : 0);
        l = i1;
        if (classdef1.getThisClassIndex() != 0) goto _L4; else goto _L11
_L11:
        l = 0;
        obj2 = classdef1.getInterfaces();
        k = 0;
        j1 = ((IInterfaceCollection) (obj2)).size();
_L13:
        j = l;
        if (k < j1)
        {
            obj3 = ((CONSTANT_Class_info)iconstantcollection.get(((IInterfaceCollection) (obj2)).get(k))).getName(classdef1);
            if (!"java/io/Serializable".equals(obj3) && !"java/io/Externalizable".equals(obj3))
            {
                break MISSING_BLOCK_LABEL_788;
            }
            j = 1;
        }
        k = ((flag) ? 1 : 0);
        l = i1;
        if (j == 0)
        {
            k = 0;
            l = i1;
        }
_L4:
        if (k != 0)
        {
            if (l > 0)
            {
                m_log.warning((new StringBuilder()).append("class [").append(classdef).append("] declares a 'serialVersionUID'").toString());
                m_log.warning("field that is not static and final: this is likely an implementation mistake");
                m_log.warning("and can interfere with EMMA's SUID compensation");
            }
            obj2 = ElementFactory.newAttributeCollection(2);
            ((IAttributeCollection) (obj2)).add(new ConstantValueAttribute_info(classdef1.addCONSTANT_Utf8("ConstantValue", true), iconstantcollection.add(new CONSTANT_Long_info(classdef1.computeSUID(true)))));
            classdef = ((ClassDef) (obj1));
            if (obj1 == null)
            {
                classdef = new SyntheticAttribute_info(m_syntheticStringIndex);
            }
            ((IAttributeCollection) (obj2)).add(classdef);
            classdef1.addField("serialVersionUID", "J", 26, ((IAttributeCollection) (obj2)));
        }
_L2:
        visit(classdef1.getAttributes(), obj);
        return obj;
_L9:
        k++;
          goto _L12
        k++;
          goto _L13
    }

    public Object visit(IAttributeCollection iattributecollection, Object obj)
    {
        int i = 0;
        for (int j = iattributecollection.size(); i < j; i++)
        {
            iattributecollection.get(i).accept(this, obj);
        }

        return obj;
    }

    public Object visit(IMethodCollection imethodcollection, Object obj)
    {
        ClassDef classdef = m_cls;
        boolean flag4 = m_log.atTRACE2();
        int l2 = imethodcollection.size();
        boolean flag5 = m_metadata;
        m_classBlockCounts = new int[l2 + 1];
        if (flag5)
        {
            m_classBlockMetadata = new int[l2 + 1][][];
            m_classMethodDescriptors = new MethodDescriptor[l2];
        }
        int k1 = 0;
        do
        {
            if (k1 < l2)
            {
                Method_info method_info = imethodcollection.get(k1);
                m_methodName = method_info.getName(classdef);
                boolean flag;
                boolean flag2;
                boolean flag6;
                if (flag4)
                {
                    Logger logger1 = m_log;
                    StringBuilder stringbuilder1 = new StringBuilder();
                    String s;
                    if (method_info.isSynthetic())
                    {
                        s = "synthetic ";
                    } else
                    {
                        s = "";
                    }
                    logger1.trace2("visit", stringbuilder1.append(s).append("method #").append(k1).append(": [").append(m_methodName).append("]").toString());
                }
                flag6 = "<clinit>".equals(m_methodName);
                flag2 = false;
                flag = flag2;
                if (!flag6)
                {
                    if (m_excludeSyntheticMethods && method_info.isSynthetic())
                    {
                        flag2 = true;
                        flag = flag2;
                        if (flag4)
                        {
                            m_log.trace2("visit", "skipped synthetic method");
                            flag = flag2;
                        }
                    } else
                    {
                        flag = flag2;
                        if (m_excludeBridgeMethods)
                        {
                            flag = flag2;
                            if (method_info.isBridge())
                            {
                                boolean flag3 = true;
                                flag = flag3;
                                if (flag4)
                                {
                                    m_log.trace2("visit", "skipped bridge method");
                                    flag = flag3;
                                }
                            }
                        }
                    }
                }
                if (flag)
                {
                    if (flag5)
                    {
                        m_classMethodDescriptors[k1] = new MethodDescriptor(m_methodName, method_info.getDescriptor(classdef), 4, m_methodBlockSizes, (int[][])null, 0);
                    }
                } else
                if ((method_info.getAccessFlags() & 0x500) != 0)
                {
                    if (flag5)
                    {
                        m_classMethodDescriptors[k1] = new MethodDescriptor(m_methodName, method_info.getDescriptor(classdef), 2, m_methodBlockSizes, (int[][])null, 0);
                    }
                    if (flag4)
                    {
                        Logger logger2 = m_log;
                        StringBuilder stringbuilder2 = (new StringBuilder()).append("skipped ");
                        String s1;
                        if (method_info.isAbstract())
                        {
                            s1 = "abstract";
                        } else
                        {
                            s1 = "native";
                        }
                        logger2.trace2("visit", stringbuilder2.append(s1).append(" method").toString());
                    }
                } else
                {
                    m_methodFirstLine = 0;
                    m_methodID = k1;
                    if (flag6)
                    {
                        m_clinitID = k1;
                        if (flag4)
                        {
                            m_log.trace2("visit", "<clinit> method delayed");
                        }
                    } else
                    {
                        IAttributeCollection iattributecollection = method_info.getAttributes();
                        int i2 = iattributecollection.size();
                        for (int i = 0; i < i2; i++)
                        {
                            iattributecollection.get(i).accept(this, obj);
                        }

                        if (flag5)
                        {
                            int ai[][] = m_classBlockMetadata[m_methodID];
                            int j;
                            if (ai == null)
                            {
                                j = 1;
                            } else
                            {
                                j = 0;
                            }
                            m_classMethodDescriptors[k1] = new MethodDescriptor(m_methodName, method_info.getDescriptor(classdef), j, m_methodBlockSizes, ai, m_methodFirstLine);
                        }
                    }
                }
                k1++;
                continue;
            }
            if (m_clinitID >= 0)
            {
                imethodcollection = imethodcollection.get(m_clinitID);
                m_classInstrMethodCount = l2;
            } else
            {
                m_clinitStatus = 8;
                int l = classdef.addCONSTANT_Utf8("Code", true);
                k1 = classdef.addCONSTANT_Utf8("<clinit>", true);
                int j2 = classdef.addCONSTANT_Utf8("()V", true);
                imethodcollection = ElementFactory.newAttributeCollection(2);
                obj1 = AttributeElementFactory.newExceptionHandlerTable(0);
                IAttributeCollection iattributecollection2 = ElementFactory.newAttributeCollection(0);
                imethodcollection.add(new CodeAttribute_info(l, 0, 0, new byte[] {
                    -79
                }, ((IExceptionHandlerTable) (obj1)), iattributecollection2));
                imethodcollection.add(new SyntheticAttribute_info(m_syntheticStringIndex));
                imethodcollection = new Method_info(10, k1, j2, imethodcollection);
                m_clinitID = classdef.addMethod(imethodcollection);
                if (flag4)
                {
                    m_log.trace2("visit", "added synthetic <clinit> method");
                }
                m_classInstrMethodCount = l2 + 1;
            }
            m_methodFirstLine = 0;
            m_methodID = m_clinitID;
            if (flag4)
            {
                Logger logger = m_log;
                StringBuilder stringbuilder = new StringBuilder();
                Object obj1;
                int k;
                if (imethodcollection.isSynthetic())
                {
                    obj1 = "synthetic ";
                } else
                {
                    obj1 = "";
                }
                logger.trace2("visit", stringbuilder.append(((String) (obj1))).append("method #").append(m_methodID).append(": [<clinit>]").toString());
            }
            obj1 = imethodcollection.getAttributes();
            k1 = ((IAttributeCollection) (obj1)).size();
            for (k = 0; k < k1; k++)
            {
                ((IAttributeCollection) (obj1)).get(k).accept(this, obj);
            }

            k1 = classdef.addCONSTANT_Utf8("Code", true);
            int k2 = classdef.addCONSTANT_Utf8("$VRi", false);
            l2 = classdef.addCONSTANT_Utf8("()[[Z", false);
            IAttributeCollection iattributecollection1 = ElementFactory.newAttributeCollection(2);
            ByteArrayOStream bytearrayostream = new ByteArrayOStream(128);
            int ai2[] = m_classBlockCounts;
            int i3 = m_classInstrMethodCount;
            CodeGen.push_int_value(bytearrayostream, classdef, i3);
            int i1 = classdef.addClassref("[[Z");
            bytearrayostream.write4(197, i1 >>> 8, i1, 1);
            bytearrayostream.write4(89, 179, m_coverageFieldrefIndex >>> 8, m_coverageFieldrefIndex);
            for (int j1 = 0; j1 < i3; j1++)
            {
                int j3 = ai2[j1];
                if (j3 > 0)
                {
                    bytearrayostream.write(89);
                    CodeGen.push_int_value(bytearrayostream, classdef, j1);
                    CodeGen.push_int_value(bytearrayostream, classdef, j3);
                    bytearrayostream.write3(188, 4, 83);
                }
            }

            bytearrayostream.write(89);
            CodeGen.push_constant_index(bytearrayostream, m_classNameConstantIndex);
            bytearrayostream.write3(20, m_stampIndex >>> 8, m_stampIndex);
            bytearrayostream.write3(184, m_registerMethodrefIndex >>> 8, m_registerMethodrefIndex);
            bytearrayostream.write(176);
            CodeAttribute_info codeattribute_info = new CodeAttribute_info(k1, 5, 0, EMPTY_BYTE_ARRAY, AttributeElementFactory.newExceptionHandlerTable(0), ElementFactory.newAttributeCollection(0));
            codeattribute_info.setCode(bytearrayostream.getByteArray(), bytearrayostream.size());
            iattributecollection1.add(codeattribute_info);
            iattributecollection1.add(new SyntheticAttribute_info(m_syntheticStringIndex));
            classdef.addMethod(new Method_info(10, k2, l2, iattributecollection1));
            if (flag4)
            {
                m_log.trace2("visit", "added synthetic pre-<clinit> method");
            }
            if (flag5)
            {
                int ai1[][] = m_classBlockMetadata[m_methodID];
                int l1 = m_clinitStatus;
                boolean flag1;
                if (ai1 == null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                m_clinitStatus = flag1 | l1;
                if ((m_clinitStatus & 8) == 0)
                {
                    m_classMethodDescriptors[m_methodID] = new MethodDescriptor("<clinit>", imethodcollection.getDescriptor(classdef), m_clinitStatus, m_methodBlockSizes, ai1, m_methodFirstLine);
                }
            }
            return obj;
        } while (true);
    }

    public Object visit(BridgeAttribute_info bridgeattribute_info, Object obj)
    {
        return obj;
    }

    public Object visit(CodeAttribute_info codeattribute_info, Object obj)
    {
        byte abyte1[];
        IntIntMap intintmap;
        IntObjectMap intobjectmap;
        Object obj1;
        int j;
        int j2;
        int k2;
        boolean flag;
        int i4;
        boolean flag3;
        boolean flag4;
        flag3 = m_log.atTRACE2();
        flag4 = m_log.atTRACE3();
        abyte1 = codeattribute_info.getCode();
        i4 = codeattribute_info.getCodeSize();
        if (flag3)
        {
            m_log.trace2("visit", (new StringBuilder()).append("code attribute for method #").append(m_methodID).append(": size = ").append(i4).toString());
        }
        obj1 = new IntSet();
        intintmap = new IntIntMap();
        ((IntSet) (obj1)).add(0);
        IExceptionHandlerTable iexceptionhandlertable = codeattribute_info.getExceptionTable();
        int i1 = iexceptionhandlertable.size();
        for (int i = 0; i < i1; i++)
        {
            ((IntSet) (obj1)).add(iexceptionhandlertable.get(i).m_handler_pc);
        }

        intobjectmap = new IntObjectMap();
        j = 0;
        flag = false;
        j2 = 0;
        intintmap.put(0, 0);
        k2 = 0;
_L10:
        int j1;
        int i2;
        int l3;
        int j4;
        if (k2 >= i4)
        {
            break MISSING_BLOCK_LABEL_1779;
        }
        j4 = abyte1[k2] & 0xff;
        l3 = 0;
        j1 = j;
        if (j != 0)
        {
            ((IntSet) (obj1)).add(k2);
            j1 = 0;
        }
        j = j1;
        i2 = l3;
        j4;
        JVM INSTR tableswitch 153 201: default 444
    //                   153 512
    //                   154 512
    //                   155 512
    //                   156 512
    //                   157 512
    //                   158 512
    //                   159 512
    //                   160 512
    //                   161 512
    //                   162 512
    //                   163 512
    //                   164 512
    //                   165 512
    //                   166 512
    //                   167 580
    //                   168 580
    //                   169 1651
    //                   170 1095
    //                   171 648
    //                   172 1731
    //                   173 1731
    //                   174 1731
    //                   175 1731
    //                   176 1731
    //                   177 1731
    //                   178 452
    //                   179 452
    //                   180 452
    //                   181 452
    //                   182 452
    //                   183 452
    //                   184 452
    //                   185 452
    //                   186 452
    //                   187 452
    //                   188 452
    //                   189 452
    //                   190 452
    //                   191 1731
    //                   192 452
    //                   193 452
    //                   194 452
    //                   195 452
    //                   196 452
    //                   197 452
    //                   198 512
    //                   199 512
    //                   200 1537
    //                   201 1537;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L3 _L4 _L5 _L6 _L7 _L7 _L7 _L7 _L7 _L7 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L7 _L8 _L8 _L8 _L8 _L8 _L8 _L2 _L2 _L9 _L9
_L8:
        break; /* Loop/switch isn't completed */
_L1:
        i2 = l3;
        j = j1;
_L11:
        if (i2 == 0)
        {
            int ai[];
            int ai4[];
            int l4;
            int j5;
            byte byte0;
            if (flag)
            {
                ai = WIDE_SIZE;
            } else
            {
                ai = NARROW_SIZE;
            }
            j1 = ai[j4];
        } else
        {
            j1 = -i2;
        }
        k2 += j1;
        if (j4 == 196)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        j2++;
        intintmap.put(k2, j2);
        flag = j1;
        if (true) goto _L10; else goto _L2
_L2:
        j = k2 + 1;
        j = k2 + (abyte1[j] << 8 | abyte1[j + 1] & 0xff);
        ((IntSet) (obj1)).add(j);
        intobjectmap.put(k2, new IFJUMP2(j4, j));
        j = 1;
        i2 = l3;
          goto _L11
_L3:
        j = k2 + 1;
        j = k2 + (abyte1[j] << 8 | abyte1[j + 1] & 0xff);
        ((IntSet) (obj1)).add(j);
        intobjectmap.put(k2, new JUMP2(j4, j));
        j = 1;
        i2 = l3;
          goto _L11
_L6:
        j1 = (k2 + 4) - (k2 & 3);
        j = abyte1[j1];
        i2 = j1 + 1;
        j1 = abyte1[i2];
        l3 = i2 + 1;
        i2 = abyte1[l3];
        l3++;
        j = j << 24 | (j1 & 0xff) << 16 | (i2 & 0xff) << 8 | abyte1[l3] & 0xff;
        ((IntSet) (obj1)).add(k2 + j);
        j1 = l3 + 1;
        i2 = abyte1[j1];
        j1++;
        l3 = abyte1[j1];
        j1++;
        l4 = abyte1[j1];
        j1++;
        i2 = (i2 & 0xff) << 24 | (l3 & 0xff) << 16 | (l4 & 0xff) << 8 | abyte1[j1] & 0xff;
        ai = new int[i2];
        ai4 = new int[i2 + 1];
        ai4[0] = k2 + j;
        for (j = 0; j < i2; j++)
        {
            l3 = j1 + 1;
            j1 = abyte1[l3];
            l4 = l3 + 1;
            l3 = abyte1[l4];
            j5 = l4 + 1;
            l4 = abyte1[j5];
            j5++;
            ai[j] = j1 << 24 | (l3 & 0xff) << 16 | (l4 & 0xff) << 8 | abyte1[j5] & 0xff;
            j1 = j5 + 1;
            l3 = abyte1[j1];
            j1++;
            l4 = abyte1[j1];
            j1++;
            j5 = abyte1[j1];
            j1++;
            l3 = l3 << 24 | (l4 & 0xff) << 16 | (j5 & 0xff) << 8 | abyte1[j1] & 0xff;
            ai4[j + 1] = k2 + l3;
            ((IntSet) (obj1)).add(k2 + l3);
        }

        intobjectmap.put(k2, new LOOKUPSWITCH(ai, ai4));
        j = 1;
        i2 = k2 - j1 - 1;
          goto _L11
_L5:
        j1 = (k2 + 4) - (k2 & 3);
        j = abyte1[j1];
        i2 = j1 + 1;
        j1 = abyte1[i2];
        l3 = i2 + 1;
        i2 = abyte1[l3];
        l3++;
        j = j << 24 | (j1 & 0xff) << 16 | (i2 & 0xff) << 8 | abyte1[l3] & 0xff;
        ((IntSet) (obj1)).add(k2 + j);
        i2 = l3 + 1;
        j1 = abyte1[i2];
        l3 = i2 + 1;
        i2 = abyte1[l3];
        l4 = l3 + 1;
        l3 = abyte1[l4];
        l4++;
        i2 = j1 << 24 | (i2 & 0xff) << 16 | (l3 & 0xff) << 8 | abyte1[l4] & 0xff;
        j1 = l4 + 1;
        l3 = abyte1[j1];
        j1++;
        l4 = abyte1[j1];
        j1++;
        j5 = abyte1[j1];
        j1++;
        l3 = l3 << 24 | (l4 & 0xff) << 16 | (j5 & 0xff) << 8 | abyte1[j1] & 0xff;
        ai = new int[(l3 - i2) + 2];
        ai[0] = k2 + j;
        for (j = i2; j <= l3; j++)
        {
            j1++;
            l4 = abyte1[j1];
            j1++;
            j5 = abyte1[j1];
            j1++;
            byte0 = abyte1[j1];
            j1++;
            l4 = l4 << 24 | (j5 & 0xff) << 16 | (byte0 & 0xff) << 8 | abyte1[j1] & 0xff;
            ai[(j - i2) + 1] = k2 + l4;
            ((IntSet) (obj1)).add(k2 + l4);
        }

        intobjectmap.put(k2, new TABLESWITCH(i2, l3, ai));
        j = 1;
        i2 = k2 - j1 - 1;
          goto _L11
_L9:
        j1 = k2 + 1;
        j = abyte1[j1];
        i2 = j1 + 1;
        j1 = abyte1[i2];
        i2++;
        j = k2 + (j << 24 | (j1 & 0xff) << 16 | (abyte1[i2] & 0xff) << 8 | abyte1[i2 + 1] & 0xff);
        ((IntSet) (obj1)).add(j);
        intobjectmap.put(k2, new JUMP4(j4, j));
        j = 1;
        i2 = l3;
          goto _L11
_L4:
        j = k2 + 1;
        if (flag)
        {
            j = (abyte1[j] & 0xff) << 8 | abyte1[j + 1] & 0xff;
        } else
        {
            j = abyte1[j] & 0xff;
        }
        intobjectmap.put(k2, new RET(j4, j));
        j = 1;
        i2 = l3;
          goto _L11
_L7:
        intobjectmap.put(k2, new TERMINATE(j4));
        j = 1;
        i2 = l3;
          goto _L11
        byte abyte0[];
        Iterator iterator;
        Block ablock[];
        int ai2[];
        int ai3[];
        int k4 = ((IntSet) (obj1)).size();
        if (flag3)
        {
            m_log.trace2("visit", (new StringBuilder()).append("method contains ").append(k4).append(" basic blocks").toString());
        }
        BlockList blocklist = new BlockList(k4);
        int ai7[] = new int[k4 + 1];
        ((IntSet) (obj1)).values(ai7, 0);
        ai7[k4] = i4;
        Arrays.sort(ai7);
        int ai8[] = intobjectmap.keys();
        Arrays.sort(ai8);
        obj1 = new IntIntMap(ai7.length);
        if (m_metadata)
        {
            m_methodBlockSizes = new int[k4];
            m_methodBlockOffsets = ai7;
        }
        consumeSignatureData(m_methodID, ai7);
        int ai5[] = new int[1];
        j = 0;
        j1 = 0;
        j2 = 0;
        do
        {
            i2 = j;
            if (j1 >= k4)
            {
                break;
            }
            Block block3 = new Block();
            blocklist.m_blocks.add(block3);
            int i5 = ai7[j1];
            block3.m_first = i5;
            ((IntIntMap) (obj1)).put(i5, j1);
            int k5 = ai7[j1 + 1];
            boolean flag2 = false;
            int l2 = j2;
            boolean flag1 = flag2;
            j = i2;
            if (ai8.length > j2)
            {
                int l5 = ai8[j2];
                l2 = j2;
                flag1 = flag2;
                j = i2;
                if (l5 < k5)
                {
                    flag1 = true;
                    block3.m_length = l5 - i5;
                    intintmap.get(l5, ai5);
                    j = ai5[0] + 1;
                    block3.m_branch = (Branch)intobjectmap.get(l5);
                    block3.m_branch.m_parentBlockID = j1;
                    l2 = j2 + 1;
                }
            }
            if (!flag1)
            {
                block3.m_length = k5 - i5;
                intintmap.get(k5, ai5);
                j = ai5[0];
            }
            block3.m_instrCount = j - i2;
            if (m_metadata)
            {
                m_methodBlockSizes[j1] = block3.m_instrCount;
            }
            j1++;
            j2 = l2;
        } while (true);
        ablock = (Block[])(Block[])blocklist.m_blocks.toArray(new Block[k4]);
        for (j = 0; j < k4; j++)
        {
            Block block1 = ablock[j];
            if (block1.m_branch == null)
            {
                continue;
            }
            int ai1[] = block1.m_branch.m_targets;
            if (ai1 == null)
            {
                continue;
            }
            j1 = 0;
            for (i2 = ai1.length; j1 < i2; j1++)
            {
                ((IntIntMap) (obj1)).get(ai1[j1], ai5);
                ai1[j1] = ai5[0];
            }

        }

        m_classBlockCounts[m_methodID] = k4;
        if (flag3)
        {
            m_log.trace2("visit", "instrumenting... ");
        }
        int k3 = codeattribute_info.m_max_locals;
        codeattribute_info.m_max_locals = k3 + 1;
        int i3;
        if (m_methodID == m_clinitID)
        {
            m_stampIndex = m_cls.getConstants().add(new CONSTANT_Long_info(m_classSignature));
            blocklist.m_header = new clinitHeader(this, k3);
        } else
        {
            blocklist.m_header = new methodHeader(this, k3);
        }
        i3 = blocklist.m_header.maxstack();
        j = 0;
        for (j1 = 0; j1 < k4;)
        {
            Block block2 = ablock[j1];
            BlockSegment blocksegment = new BlockSegment(this, k3, j1);
            block2.m_insertion = blocksegment;
            j2 = blocksegment.maxstack();
            i2 = j;
            if (j2 > j)
            {
                i2 = j2;
            }
            j1++;
            j = i2;
        }

        j1 = codeattribute_info.m_max_stack;
        codeattribute_info.m_max_stack = codeattribute_info.m_max_stack + j;
        if (i3 > codeattribute_info.m_max_stack)
        {
            codeattribute_info.m_max_stack = i3;
        }
        if (flag4)
        {
            m_log.trace3("visit", (new StringBuilder()).append("increasing maxstack by ").append(codeattribute_info.m_max_stack - j1).toString());
        }
        if (flag3)
        {
            m_log.trace2("visit", "assembling... ");
        }
        j1 = i4 << 1;
        j = j1;
        if (j1 < 64)
        {
            j = 64;
        }
        ByteArrayOStream bytearrayostream = new ByteArrayOStream(j);
        EmitCtx emitctx = new EmitCtx(blocklist, bytearrayostream);
        ai2 = new int[k4];
        ai3 = new int[ai2.length];
        blocklist.m_header.emit(emitctx);
        ai3[0] = emitctx.m_out.size();
        for (j = 0; j < k4; j++)
        {
            Block block = ablock[j];
            if (j + 1 < k4)
            {
                ai2[j + 1] = ablock[j].m_first + ablock[j].m_length;
            }
            block.emit(emitctx, abyte1);
            if (j + 1 < k4)
            {
                ai3[j + 1] = emitctx.m_out.size() - ablock[j + 1].m_first;
            }
        }

        m_methodJumpAdjOffsets = ai2;
        m_methodJumpAdjValues = ai3;
        if (flag4)
        {
            StringBuffer stringbuffer = new StringBuffer((new StringBuilder()).append("jump adjustment map:").append(EOL).toString());
            for (j = 0; j < ai2.length; j++)
            {
                stringbuffer.append((new StringBuilder()).append("    ").append(ai2[j]).append(": +").append(ai3[j]).toString());
                if (j < ai2.length - 1)
                {
                    stringbuffer.append(EOL);
                }
            }

            m_log.trace3("visit", stringbuffer.toString());
        }
        abyte0 = bytearrayostream.getByteArray();
        i2 = bytearrayostream.size();
        if (flag4)
        {
            m_log.trace3("visit", (new StringBuilder()).append("backpatching ").append(emitctx.m_backpatchQueue.size()).append(" ip(s)").toString());
        }
        iterator = emitctx.m_backpatchQueue.iterator();
_L18:
        if (!iterator.hasNext()) goto _L13; else goto _L12
_L12:
        int ai6[];
        ai6 = (int[])(int[])iterator.next();
        j1 = ai6[1];
        j2 = ablock[ai6[3]].m_first - ai6[2];
        j = j1;
        ai6[0];
        JVM INSTR tableswitch 2 4: default 3068
    //                   2 3071
    //                   3 3068
    //                   4 3093;
           goto _L14 _L15 _L14 _L16
_L14:
        continue; /* Loop/switch isn't completed */
_L15:
        abyte0[j] = (byte)(j2 >>> 8);
        abyte0[j + 1] = (byte)j2;
        continue; /* Loop/switch isn't completed */
_L16:
        int j3 = j1 + 1;
        abyte0[j1] = (byte)(j2 >>> 24);
        j = j3 + 1;
        abyte0[j3] = (byte)(j2 >>> 16);
        if (true) goto _L15; else goto _L13
_L13:
        codeattribute_info.setCode(abyte0, i2);
        if (flag3)
        {
            m_log.trace2("visit", (new StringBuilder()).append("method assembled into ").append(i2).append(" code bytes").toString());
        }
        IExceptionHandlerTable iexceptionhandlertable1 = codeattribute_info.getExceptionTable();
        for (int k = 0; k < iexceptionhandlertable1.size(); k++)
        {
            Exception_info exception_info = iexceptionhandlertable1.get(k);
            int k1 = lowbound(ai2, exception_info.m_start_pc);
            exception_info.m_start_pc = exception_info.m_start_pc + ai3[k1];
            k1 = lowbound(ai2, exception_info.m_end_pc);
            exception_info.m_end_pc = exception_info.m_end_pc + ai3[k1];
            k1 = lowbound(ai2, exception_info.m_handler_pc);
            exception_info.m_handler_pc = exception_info.m_handler_pc + ai3[k1];
        }

        codeattribute_info = codeattribute_info.getAttributes();
        int l1 = codeattribute_info.size();
        for (int l = 0; l < l1; l++)
        {
            codeattribute_info.get(l).accept(this, obj);
        }

        return obj;
        if (true) goto _L18; else goto _L17
_L17:
    }

    public Object visit(ConstantValueAttribute_info constantvalueattribute_info, Object obj)
    {
        return obj;
    }

    public Object visit(ExceptionsAttribute_info exceptionsattribute_info, Object obj)
    {
        return obj;
    }

    public Object visit(GenericAttribute_info genericattribute_info, Object obj)
    {
        return obj;
    }

    public Object visit(InnerClassesAttribute_info innerclassesattribute_info, Object obj)
    {
        return obj;
    }

    public Object visit(LineNumberTableAttribute_info linenumbertableattribute_info, Object obj)
    {
        int j2;
        boolean flag;
        boolean flag1;
        flag = m_log.atTRACE2();
        flag1 = m_log.atTRACE3();
        if (flag)
        {
            m_log.trace2("visit", (new StringBuilder()).append("attribute: [").append(linenumbertableattribute_info.getName(m_cls)).append("]").toString());
        }
        j2 = linenumbertableattribute_info.size();
        if (!m_metadata) goto _L2; else goto _L1
_L1:
        int ai1[][];
        int k2;
        if (flag)
        {
            m_log.trace2("visit", "processing line number table for metadata...");
        }
        k2 = m_classBlockCounts[m_methodID];
        ai1 = new int[k2][];
        if (j2 != 0) goto _L4; else goto _L3
_L3:
        for (int i = 0; i < k2; i++)
        {
            ai1[i] = EMPTY_INT_ARRAY;
        }

          goto _L5
_L4:
        Object obj1;
        LineNumber_info linenumber_info2;
        LineNumber_info alinenumber_info[];
        int ai2[];
        int k;
        int j1;
        alinenumber_info = new LineNumber_info[linenumbertableattribute_info.size()];
        for (int j = 0; j < j2; j++)
        {
            alinenumber_info[j] = linenumbertableattribute_info.get(j);
        }

        Arrays.sort(alinenumber_info, LINE_NUMBER_COMPARATOR);
        ai2 = m_methodBlockOffsets;
        linenumber_info2 = alinenumber_info[0];
        obj1 = null;
        m_methodFirstLine = linenumber_info2.m_line_number;
        k = 0;
        j1 = 0;
_L7:
        if (k < k2)
        {
            IntSet intset = new IntSet();
            int i2 = j1;
            LineNumber_info linenumber_info = linenumber_info2;
            LineNumber_info linenumber_info3 = obj1;
            if (obj1 != null)
            {
                i2 = j1;
                linenumber_info = linenumber_info2;
                linenumber_info3 = obj1;
                if (linenumber_info2.m_start_pc > ai2[k])
                {
                    intset.add(((LineNumber_info) (obj1)).m_line_number);
                    linenumber_info3 = obj1;
                    linenumber_info = linenumber_info2;
                    i2 = j1;
                }
            }
            do
            {
label0:
                {
                    if (linenumber_info.m_start_pc < ai2[k + 1])
                    {
                        intset.add(linenumber_info.m_line_number);
                        if (i2 != j2 - 1)
                        {
                            break label0;
                        }
                    }
                    ai1[k] = intset.values();
                    k++;
                    j1 = i2;
                    linenumber_info2 = linenumber_info;
                    obj1 = linenumber_info3;
                    continue; /* Loop/switch isn't completed */
                }
                linenumber_info3 = linenumber_info;
                i2++;
                linenumber_info = alinenumber_info[i2];
            } while (true);
        }
_L5:
        m_classBlockMetadata[m_methodID] = ai1;
        if (flag1)
        {
            StringBuffer stringbuffer = new StringBuffer((new StringBuilder()).append("block-line map for method #").append(m_methodID).append(":").toString());
            for (int l = 0; l < k2; l++)
            {
                stringbuffer.append(EOL);
                stringbuffer.append((new StringBuilder()).append("    block ").append(l).append(": ").toString());
                int ai[] = ai1[l];
                for (int k1 = 0; k1 < ai.length; k1++)
                {
                    if (k1 != 0)
                    {
                        stringbuffer.append(", ");
                    }
                    stringbuffer.append(ai[k1]);
                }

            }

            m_log.trace3("visit", stringbuffer.toString());
        }
_L2:
        for (int i1 = 0; i1 < j2; i1++)
        {
            LineNumber_info linenumber_info1 = linenumbertableattribute_info.get(i1);
            int l1 = lowbound(m_methodJumpAdjOffsets, linenumber_info1.m_start_pc);
            linenumber_info1.m_start_pc = linenumber_info1.m_start_pc + m_methodJumpAdjValues[l1];
        }

        return obj;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public Object visit(SourceFileAttribute_info sourcefileattribute_info, Object obj)
    {
        m_classSrcFileName = sourcefileattribute_info.getSourceFile(m_cls).m_value;
        return obj;
    }

    public Object visit(SyntheticAttribute_info syntheticattribute_info, Object obj)
    {
        return obj;
    }

}
