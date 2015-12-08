// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;

public class TigerDigest
    implements ExtendedDigest
{

    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH = 24;
    private static final long t1[] = {
        0x2aab17cf7e90c5eL, 0xac424b03e243a8ecL, 0x72cd5be30dd5fcd3L, 0x6d019b93f6f97f3aL, 0xcd9978ffd21f9193L, 0x7573a1c9708029e2L, 0xb164326b922a83c3L, 0x46883eee04915870L, 0xeaace3057103ece6L, 0xc54169b808a3535cL, 
        0x4ce754918ddec47cL, 0xaa2f4dfdc0df40cL, 0x10b76f18a74dbefaL, 0xc6ccb6235ad1ab6aL, 0x13726121572fe2ffL, 0x1a488c6f199d921eL, 0x4bc9f9f4da0007caL, 0x26f5e6f6e85241c7L, 0x859079dbea5947b6L, 0x4f1885c5c99e8c92L, 
        0xd78e761ea96f864bL, 0x8e36428c52b5c17dL, 0x69cf6827373063c1L, 0xb607c93d9bb4c56eL, 0x7d820e760e76b5eaL, 0x645c9cc6f07fdc42L, 0xbf38a078243342e0L, 0x5f6b343c9d2e7d04L, 0xf2c28aeb600b0ec6L, 0x6c0ed85f7254bcacL, 
        0x71592281a4db4fe5L, 0x1967fa69ce0fed9fL, 0xfd5293f8b96545dbL, 0xc879e9d7f2a7600bL, 0x860248920193194eL, 0xa4f9533b2d9cc0b3L, 0x9053836c15957613L, 0xdb6dcf8afc357bf1L, 0x18beea7a7a370f57L, 0x37117ca50b99066L, 
        0x6ab30a9774424a35L, 0xf4e92f02e325249bL, 0x7739db07061ccae1L, 0xd8f3b49ceca42a05L, 0xbd56be3f51382f73L, 0x45faed5843b0bb28L, 0x1c813d5c11bf1f83L, 0x8af0e4b6d75fa169L, 0x33ee18a487ad9999L, 0x3c26e8eab1c94410L, 
        0xb510102bc0a822f9L, 0x141eef310ce6123bL, 0xfc65b90059ddb154L, 0xe0158640c5e0e607L, 0x884e079826c3a3cfL, 0x930d0d9523c535fdL, 0x35638d754e9a2b00L, 0x4085fccf40469dd5L, 0xc4b17ad28be23a4cL, 0xcab2f0fc6a3e6a2eL, 
        0x2860971a6b943fcdL, 0x3dde6ee212e30446L, 0x6222f32ae01765aeL, 0x5d550bb5478308feL, 0xa9efa98da0eda22aL, 0xc351a71686c40da7L, 0x1105586d9c867c84L, 0xdcffee85fda22853L, 0xccfbd0262c5eef76L, 0xbaf294cb8990d201L, 
        0xe69464f52afad975L, 0x94b013afdf133e14L, 0x6a7d1a32823c958L, 0x6f95fe5130f61119L, 0xd92ab34e462c06c0L, 0xed7bde33887c71d2L, 0x79746d6e6518393eL, 0x5ba419385d713329L, 0x7c1ba6b948a97564L, 0x31987c197bfdac67L, 
        0xde6c23c44b053d02L, 0x581c49fed002d64dL, 0xdd474d6338261571L, 0xaa4546c3e473d062L, 0x928fce349455f860L, 0x48161bbacaab94d9L, 0x63912430770e6f68L, 0x6ec8a5e602c6641cL, 0x87282515337ddd2bL, 0x2cda6b42034b701bL, 
        0xb03d37c181cb096dL, 0xe108438266c71c6fL, 0x2b3180c7eb51b255L, 0xdf92b82f96c08bbcL, 0x5c68c8c0a632f3baL, 0x5504cc861c3d0556L, 0xabbfa4e55fb26b8fL, 0x41848b0ab3baceb4L, 0xb334a273aa445d32L, 0xbca696f0a85ad881L, 
        0x24f6ec65b528d56cL, 0xce1512e90f4524aL, 0x4e9dd79d5506d35aL, 0x258905fac6ce9779L, 0x2019295b3e109b33L, 0xf8a9478b73a054ccL, 0x2924f2f934417eb0L, 0x3993357d536d1bc4L, 0x38a81ac21db6ff8bL, 0x47c4fbf17d6016bfL, 
        0x1e0faadd7667e3f5L, 0x7abcff62938beb96L, 0xa78dad948fc179c9L, 0x8f1f98b72911e50dL, 0x61e48eae27121a91L, 0x4d62f7ad31859808L, 0xeceba345ef5ceaebL, 0xf5ceb25ebc9684ceL, 0xf633e20cb7f76221L, 0xa32cdf06ab8293e4L, 
        0x985a202ca5ee2ca4L, 0xcf0b8447cc8a8fb1L, 0x9f765244979859a3L, 0xa8d516b1a1240017L, 0xbd7ba3ebb5dc726L, 0xe54bca55b86adb39L, 0x1d7a3afd6c478063L, 0x519ec608e7669eddL, 0xe5715a2d149aa23L, 0x177d4571848ff194L, 
        0xeeb55f3241014c22L, 0xf5e5ca13a6e2ec2L, 0x8029927b75f5c361L, 0xad139fabc3d6e436L, 0xd5df1a94ccf402fL, 0x3e8bd948bea5dfc8L, 0xa5a0d357bd3ff77eL, 0xa2d12e251f74f645L, 0x66fd9e525e81a082L, 0x2e0c90ce7f687a49L, 
        0xc2e8bcbeba973bc5L, 0x1bce509745fL, 0x423777bbe6dab3d6L, 0xd1661c7eaef06eb5L, 0xa1781f354daacfd8L, 0x2d11284a2b16affcL, 0xf1fc4f67fa891d1fL, 0x73ecc25dcb920adaL, 0xae610c22c2a12651L, 0x96e0a810d356b78aL, 
        0x5a9a381f2fe7870fL, 0xd5ad62ede94e5530L, 0xd225e5e8368d1427L, 0x65977b70c7af4631L, 0x99f889b2de39d74fL, 0x233f30bf54e1d143L, 0x9a9675d3d9a63c97L, 0x5470554ff334f9a8L, 0x166acb744a4f5688L, 0x70c74caab2e4aeadL, 
        0xf0d091646f294d12L, 0x57b82a89684031d1L, 0xefd95a5a61be0b6bL, 0x2fbd12e969f2f29aL, 0x9bd37013feff9fe8L, 0x3f9b0404d6085a06L, 0x4940c1f3166cfe15L, 0x9542c4dcdf3defbL, 0xb4c5218385cd5ce3L, 0xc935b7dc4462a641L, 
        0x3417f8a68ed3b63fL, 0xb80959295b215b40L, 0xf99cdaef3b8c8572L, 0x18c0614f8fcb95dL, 0x1b14accd1a3acdf3L, 0x84d471f200bb732dL, 0xc1a3110e95e8da16L, 0x430a7220bf1a82b8L, 0xb77e090d39df210eL, 0x5ef4bd9f3cd05e9dL, 
        0x9d4ff6da7e57a444L, 0xda1d60e183d4a5f8L, 0xb287c38417998e47L, 0xfe3edc121bb31886L, 0xc7fe3ccc980ccbefL, 0xe46fb590189bfd03L, 0x3732fd469a4c57dcL, 0x7ef700a07cf1ad65L, 0x59c64468a31d8859L, 0x762fb0b4d45b61f6L, 
        0x155baed099047718L, 0x68755e4c3d50baa6L, 0xe9214e7f22d8b4dfL, 0x2addbf532eac95f4L, 0x32ae3909b4bd0109L, 0x834df537b08e3450L, 0xfa209da84220728dL, 0x9e691d9b9efe23f7L, 0x446d288c4ae8d7fL, 0x7b4cc524e169785bL, 
        0x21d87f0135ca1385L, 0xcebb400f137b8aa5L, 0x272e2b66580796beL, 0x3612264125c2b0deL, 0x57702bdad1efbb2L, 0xd4babb8eacf84be9L, 0x91583139641bc67bL, 0x8bdc2de08036e024L, 0x603c8156f49f68edL, 0xf7d236f7dbef5111L, 
        0x9727c4598ad21e80L, 0xa08a0896670a5fd7L, 0xcb4a8f4309eba9cbL, 0x81af564b0f7036a1L, 0xc0b99aa778199abdL, 0x959f1ec83fc8e952L, 0x8c505077794a81b9L, 0x3acaaf8f056338f0L, 0x7b43f50627a6778L, 0x4a44ab49f5eccc77L, 
        0x3bc3d6e4b679ee98L, 0x9cc0d4d1cf14108cL, 0x4406c00b206bc8a0L, 0x82a18854c8d72d89L, 0x67e366b35c3c432cL, 0xb923dd61102b37f2L, 0x56ab2779d884271dL, 0xbe83e1b0ff1525afL, 0xfb7c65d4217e49a9L, 0x6bdbe0e76d48e7d4L, 
        0x8df828745d9179eL, 0x22ea6a9add53bd34L, 0xe36e141c5622200aL, 0x7f805d1b8cb750eeL, 0xafe5c7a59f58e837L, 0xe27f996a4fb1c23cL, 0xd3867dfb0775f0d0L, 0xd0e673de6e88891aL, 0x123aeb9eafb86c25L, 0x30f1d5d5c145b895L, 
        0xbb434a2dee7269e7L, 0x78cb67ecf931fa38L, 0xf33b0372323bbf9cL, 0x52d66336fb279c74L, 0x505f33ac0afb4eaaL, 0xe8a5cd99a2cce187L, 0x534974801e2d30bbL, 0x8d2d5711d5876d90L, 0x1f1a412891bc038eL, 0xd6e2e71d82e56648L, 
        0x74036c3a497732b7L, 0x89b67ed96361f5abL, 0xffed95d8f1ea02a2L, 0xe72b3bd61464d43dL, 0xa6300f170bdc4820L, 0xebc18760ed78a77aL
    };
    private static final long t2[] = {
        0xe6a6be5a05a12138L, 0xb5a122a5b4f87c98L, 0x563c6089140b6990L, 0x4c46cb2e391f5dd5L, 0xd932addbc9b79434L, 0x8ea70e42015aff5L, 0xd765a6673e478cf1L, 0xc4fb757eab278d99L, 0xdf11c6862d6e0692L, 0xddeb84f10d7f3b16L, 
        0x6f2ef604a665ea04L, 0x4a8e0f0ff0e0dfb3L, 0xa5edeef83dbcba51L, 0xfc4f0a2a0ea4371eL, 0xe83e1da85cb38429L, 0xdc8ff882ba1b1ce2L, 0xcd45505e8353e80dL, 0x18d19a00d4db0717L, 0x34a0cfeda5f38101L, 0xbe77e518887caf2L, 
        0x1e341438b3c45136L, 0xe05797f49089ccf9L, 0xffd23f9df2591d14L, 0x543dda228595c5cdL, 0x661f81fd99052a33L, 0x8736e641db0f7b76L, 0x15227725418e5307L, 0xe25f7f46162eb2faL, 0x48a8b2126c13d9feL, 0xafdc541792e76eeaL, 
        0x3d912bfc6d1898fL, 0x31b1aafa1b83f51bL, 0xf1ac2796e42ab7d9L, 0x40a3a7d7fcd2ebacL, 0x1056136d0afbbcc5L, 0x7889e1dd9a6d0c85L, 0xd33525782a7974aaL, 0xa7e25d09078ac09bL, 0xbd4138b3eac6edd0L, 0x920abfbe71eb9e70L, 
        0xa2a5d0f54fc2625cL, 0xc054e36b0b1290a3L, 0xf6dd59ff62fe932bL, 0x3537354511a8ac7dL, 0xca845e9172fadcd4L, 0x84f82b60329d20dcL, 0x79c62ce1cd672f18L, 0x8b09a2add124642cL, 0xd0c1e96a19d9e726L, 0x5a786a9b4ba9500cL, 
        0xe020336634c43f3L, 0xc17b474aeb66d822L, 0x6a731ae3ec9baac2L, 0x8226667ae0840258L, 0x67d4567691caeca5L, 0x1d94155c4875adb5L, 0x6d00fd985b813fdfL, 0x51286efcb774cd06L, 0x5e8834471fa744afL, 0xf72ca0aee761ae2eL, 
        0xbe40e4cdaee8e09aL, 0xe9970bbb5118f665L, 0x726e4beb33df1964L, 0x703b000729199762L, 0x4631d816f5ef30a7L, 0xb880b5b51504a6beL, 0x641793c37ed84b6cL, 0x7b21ed77f6e97d96L, 0x776306312ef96b73L, 0xae528948e86ff3f4L, 
        0x53dbd7f286a3f8f8L, 0x16cadce74cfc1063L, 0x5c19bdfa52c6ddL, 0x68868f5d64d46ad3L, 0x3a9d512ccf1e186aL, 0x367e62c2385660aeL, 0xe359e7ea77dcb1d7L, 0x526c0773749abe6eL, 0x735ae5f9d09f734bL, 0x493fc7cc8a558ba8L, 
        0xb0b9c1533041ab45L, 0x321958ba470a59bdL, 0x852db00b5f46c393L, 0x91209b2bd336b0e5L, 0x6e604f7d659ef19fL, 0xb99a8ae2782ccb24L, 0xccf52ab6c814c4c7L, 0x4727d9afbe11727bL, 0x7e950d0c0121b34dL, 0x756f435670ad471fL, 
        0xf5add442615a6849L, 0x4e87e09980b9957aL, 0x2acfa1df50aee355L, 0xd898263afd2fd556L, 0xc8f4924dd80c8fd6L, 0xcf99ca3d754a173aL, 0xfe477bacaf91bf3cL, 0xed5371f6d690c12dL, 0x831a5c285e687094L, 0xc5d3c90a3708a0a4L, 
        0xf7f903717d06580L, 0x19f9bb13b8fdf27fL, 0xb1bd6f1b4d502843L, 0x1c761ba38fff4012L, 0xd1530c4e2e21f3bL, 0x8943ce69a7372c8aL, 0xe5184e11feb5ce66L, 0x618bdb80bd736621L, 0x7d29bad68b574d0bL, 0x81bb613e25e6fe5bL, 
        0x71c9c10bc07913fL, 0xc7beeb7909ac2d97L, 0xc3e58d353bc5d757L, 0xeb017892f38f61e8L, 0xd4effb9c9b1cc21aL, 0x99727d26f494f7abL, 0xa3e063a2956b3e03L, 0x9d4a8b9a4aa09c30L, 0x3f6ab7d500090fb4L, 0x9cc0f2a057268ac0L, 
        0x3dee9d2dedbf42d1L, 0x330f49c87960a972L, 0xc6b2720287421b41L, 0xac59ec07c00369cL, 0xef4eac49cb353425L, 0xf450244eef0129d8L, 0x8acc46e5caf4deb6L, 0x2ffeab63989263f7L, 0x8f7cb9fe5d7a4578L, 0x5bd8f7644e634635L, 
        0x427a7315bf2dc900L, 0x17d0c4aa2125261cL, 0x3992486c93518e50L, 0xb4cbfee0a2d7d4c3L, 0x7c75d6202c5ddd8dL, 0xdbc295d8e35b6c61L, 0x60b369d302032b19L, 0xce42685fdce44132L, 0x6f3ddb9ddf65610L, 0x8ea4d21db5e148f0L, 
        0x20b0fce62fcd496fL, 0x2c1b912358b0ee31L, 0xb28317b818f5a308L, 0xa89c1e189ca6d2cfL, 0xc6b18576aaadbc8L, 0xb65deaa91299fae3L, 0xfb2b794b7f1027e7L, 0x4e4317f443b5bebL, 0x4b852d325939d0a6L, 0xd5ae6beefb207ffcL, 
        0x309682b281c7d374L, 0xbae309a194c3b475L, 0x8cc3f97b13b49f05L, 0x98a9422ff8293967L, 0x244b16b01076ff7cL, 0xf8bf571c663d67eeL, 0x1f0d6758eee30da1L, 0xc9b611d97adeb9b7L, 0xb7afd5887b6c57a2L, 0x6290ae846b984fe1L, 
        0x94df4cdeacc1a5fdL, 0x58a5bd1c5483affL, 0x63166cc142ba3c37L, 0x8db8526eb2f76f40L, 0xe10880036f0d6d4eL, 0x9e0523c9971d311dL, 0x45ec2824cc7cd691L, 0x575b8359e62382c9L, 0xfa9e400dc4889995L, 0xd1823ecb45721568L, 
        0xdafd983b8206082fL, 0xaa7d29082386a8cbL, 0x269fcd4403b87588L, 0x1b91f5f728bdd1e0L, 0xe4669f39040201f6L, 0x7a1d7c218cf04adeL, 0x65623c29d79ce5ceL, 0x2368449096c00bb1L, 0xab9bf1879da503baL, 0xbc23ecb1a458058eL, 
        0x9a58df01bb401eccL, 0xa070e868a85f143dL, 0x4ff188307df2239eL, 0x14d565b41a641183L, 0xee13337452701602L, 0x950e3dcf3f285e09L, 0x59930254b9c80953L, 0x3bf299408930da6dL, 0xa955943f53691387L, 0xa15edecaa9cb8784L, 
        0x29142127352be9a0L, 0x76f0371fff4e7afbL, 0x239f450274f2228L, 0xbb073af01d5e868bL, 0xbfc80571c10e96c1L, 0xd267088568222e23L, 0x9671a3d48e80b5b0L, 0x55b5d38ae193bb81L, 0x693ae2d0a18b04b8L, 0x5c48b4ecadd5335fL, 
        0xfd743b194916a1caL, 0x2577018134be98c4L, 0xe77987e83c54a4adL, 0x28e11014da33e1b9L, 0x270cc59e226aa213L, 0x71495f756d1a5f60L, 0x9be853fb60afef77L, 0xadc786a7f7443dbfL, 0x904456173b29a82L, 0x58bc7a66c232bd5eL, 
        0xf306558c673ac8b2L, 0x41f639c6b6c9772aL, 0x216defe99fda35daL, 0x11640cc71c7be615L, 0x93c43694565c5527L, 0xea038e6246777839L, 0xf9abf3ce5a3e2469L, 0x741e768d0fd312d2L, 0x144b883ced652c6L, 0xc20b5a5ba33f8552L, 
        0x1ae69633c3435a9dL, 0x97a28ca4088cfdecL, 0x8824a43c1e96f420L, 0x37612fa66eeea746L, 0x6b4cb165f9cf0e5aL, 0x43aa1c06a0abfb4aL, 0x7f4dc26ff162796bL, 0x6cbacc8e54ed9b0fL, 0xa6b7ffefd2bb253eL, 0x2e25bc95b0a29d4fL, 
        0x86d6a58bdef1388cL, 0xded74ac576b6f054L, 0x8030bdbc2b45805dL, 0x3c81af70e94d9289L, 0x3eff6dda9e3100dbL, 0xb38dc39fdfcc8847L, 0x123885528d17b87eL, 0xf2da0ed240b1b642L, 0x44cefadcd54bf9a9L, 0x1312200e433c7ee6L, 
        0x9ffcc84f3a78c748L, 0xf0cd1f72248576bbL, 0xec6974053638cfe4L, 0x2ba7b67c0cec4e4cL, 0xac2f4df3e5ce32edL, 0xcb33d14326ea4c11L, 0xa4e9044cc77e58bcL, 0x5f513293d934fcefL, 0x5dc9645506e55444L, 0x50de418f317de40aL, 
        0x388cb31a69dde259L, 0x2db4a83455820a86L, 0x9010a91e84711ae9L, 0x4df7f0b7b1498371L, 0xd62a2eabc0977179L, 0x22fac097aa8d5c0eL
    };
    private static final long t3[] = {
        0xf49fcc2ff1daf39bL, 0x487fd5c66ff29281L, 0xe8a30667fcdca83fL, 0x2c9b4be3d2fcce63L, 0xda3ff74b93fbbbc2L, 0x2fa165d2fe70ba66L, 0xa103e279970e93d4L, 0xbecdec77b0e45e71L, 0xcfb41e723985e497L, 0xb70aaa025ef75017L, 
        0xd42309f03840b8e0L, 0x8efc1ad035898579L, 0x96c6920be2b2abc5L, 0x66af4163375a9172L, 0x2174abdcca7127fbL, 0xb33ccea64a72ff41L, 0xf04a4933083066a5L, 0x8d970acdd7289af5L, 0x8f96e8e031c8c25eL, 0xf3fec02276875d47L, 
        0xec7bf310056190ddL, 0xf5adb0aebb0f1491L, 0x9b50f8850fd58892L, 0x4975488358b74de8L, 0xa3354ff691531c61L, 0x702bbe481d2c6eeL, 0x89fb24057deded98L, 0xac3075138596e902L, 0x1d2d3580172772edL, 0xeb738fc28e6bc30dL, 
        0x5854ef8f63044326L, 0x9e5c52325add3bbeL, 0x90aa53cf325c4623L, 0xc1d24d51349dd067L, 0x2051cfeea69ea624L, 0x13220f0a862e7e4fL, 0xce39399404e04864L, 0xd9c42ca47086fcb7L, 0x685ad2238a03e7ccL, 0x66484b2ab2ff1dbL, 
        0xfe9d5d70efbf79ecL, 0x5b13b9dd9c481854L, 0x15f0d475ed1509adL, 0xbebcd060ec79851L, 0xd58c6791183ab7f8L, 0xd1187c5052f3eee4L, 0xc95d1192e54e82ffL, 0x86eea14cb9ac6ca2L, 0x3485beb153677d5dL, 0xdd191d781f8c492aL, 
        0xf60866baa784ebf9L, 0x518f643ba2d08c74L, 0x8852e956e1087c22L, 0xa768cb8dc410ae8dL, 0x38047726bfec8e1aL, 0xa67738b4cd3b45aaL, 0xad16691cec0dde19L, 0xc6d4319380462e07L, 0xc5a5876d0ba61938L, 0x16b9fa1fa58fd840L, 
        0x188ab1173ca74f18L, 0xabda2f98c99c021fL, 0x3e0580ab134ae816L, 0x5f3b05b773645abbL, 0x2501a2be5575f2f6L, 0x1b2f74004e7e8ba9L, 0x1cd7580371e8d953L, 0x7f6ed89562764e30L, 0xb15926ff596f003dL, 0x9f65293da8c5d6b9L, 
        0x6ecef04dd690f84cL, 0x4782275fff33af88L, 0xe41433083f820801L, 0xfd0dfe409a1af9b5L, 0x4325a3342cdb396bL, 0x8ae77e62b301b252L, 0xc36f9e9f6655615aL, 0x85455a2d92d32c09L, 0xf2c7dea949477485L, 0x63cfb4c133a39ebaL, 
        0x83b040cc6ebc5462L, 0x3b9454c8fdb326b0L, 0x56f56a9e87ffd78cL, 0x2dc2940d99f42bc6L, 0x98f7df096b096e2dL, 0x19a6e01e3ad852bfL, 0x42a99ccbdbd4b40bL, 0xa59998af45e9c559L, 0x366295e807d93186L, 0x6b48181bfaa1f773L, 
        0x1fec57e2157a0a1dL, 0x4667446af6201ad5L, 0xe615ebcacfb0f075L, 0xb8f31f4f68290778L, 0x22713ed6ce22d11eL, 0x3057c1a72ec3c93bL, 0xcb46acc37c3f1f2fL, 0xdbb893fd02aaf50eL, 0x331fd92e600b9fcfL, 0xa498f96148ea3ad6L, 
        0xa8d8426e8b6a83eaL, 0xa089b274b7735cdcL, 0x87f6b3731e524a11L, 0x118808e5cbc96749L, 0x9906e4c7b19bd394L, 0xafed7f7e9b24a20cL, 0x6509eadeeb3644a7L, 0x6c1ef1d3e8ef0edeL, 0xb9c97d43e9798fb4L, 0xa2f2d784740c28a3L, 
        0x7b8496476197566fL, 0x7a5be3e6b65f069dL, 0xf96330ed78be6f10L, 0xeee60de77a076a15L, 0x2b4bee4aa08b9bd0L, 0x6a56a63ec7b8894eL, 0x2121359ba34fef4L, 0x4cbf99f8283703fcL, 0x398071350caf30c8L, 0xd0a77a89f017687aL, 
        0xf1c1a9eb9e423569L, 0x8c7976282dee8199L, 0x5d1737a5dd1f7abdL, 0x4f53433c09a9fa80L, 0xfa8b0c53df7ca1d9L, 0x3fd9dcbc886ccb77L, 0xc040917ca91b4720L, 0x7dd00142f9d1dcdfL, 0x8476fc1d4f387b58L, 0x23f8e7c5f3316503L, 
        0x32a2244e7e37339L, 0x5c87a5d750f5a74bL, 0x82b4cc43698992eL, 0xdf917becb858f63cL, 0x3270b8fc5bf86ddaL, 0x10ae72bb29b5dd76L, 0x576ac94e7700362bL, 0x1ad112dac61efb8fL, 0x691bc30ec5faa427L, 0xff246311cc327143L, 
        0x3142368e30e53206L, 0x71380e31e02ca396L, 0x958d5c960aad76f1L, 0xf8d6f430c16da536L, 0xc8ffd13f1be7e1d2L, 0x7578ae66004ddbe1L, 0x5833f01067be646L, 0xbb34b5ad3bfe586dL, 0x95f34c9a12b97f0L, 0x247ab64525d60ca8L, 
        0xdcdbc6f3017477d1L, 0x4a2e14d4decad24dL, 0xbdb5e6d9be0a1eebL, 0x2a7e70f7794301abL, 0xdef42d8a270540fdL, 0x1078ec0a34c22c1L, 0xe5de511af4c16387L, 0x7ebb3a52bd9a330aL, 0x77697857aa7d6435L, 0x4e831603ae4c32L, 
        0xe7a21020ad78e312L, 0x9d41a70c6ab420f2L, 0x28e06c18ea1141e6L, 0xd2b28cbd984f6b28L, 0x26b75f6c446e9d83L, 0xba47568c4d418d7fL, 0xd80badbfe6183d8eL, 0xe206d7f5f166044L, 0xe258a43911cbca3eL, 0x723a1746b21dc0bcL, 
        0xc7caa854f5d7cdd3L, 0x7cac32883d261d9cL, 0x7690c26423ba942cL, 0x17e55524478042b8L, 0xe0be477656a2389fL, 0x4d289b5e67ab2da0L, 0x44862b9c8fbbfd31L, 0xb47cc8049d141365L, 0x822c1b362b91c793L, 0x4eb14655fb13dfd8L, 
        0x1ecbba0714e2a97bL, 0x6143459d5cde5f14L, 0x53a8fbf1d5f0ac89L, 0x97ea04d81c5e5b00L, 0x622181a8d4fdb3f3L, 0xe9bcd341572a1208L, 0x1411258643cce58aL, 0x9144c5fea4c6e0a4L, 0xd33d06565cf620fL, 0x54a48d489f219ca1L, 
        0xc43e5eac6d63c821L, 0xa9728b3a72770dafL, 0xd7934e7b20df87efL, 0xe35503b61a3e86e5L, 0xcae321fbc819d504L, 0x129a50b3ac60bfa6L, 0xcd5e68ea7e9fb6c3L, 0xb01c90199483b1c7L, 0x3de93cd5c295376cL, 0xaed52edf2ab9ad13L, 
        0x2e60f512c0a07884L, 0xbc3d86a3e36210c9L, 0x35269d9b163951ceL, 0xc7d6e2ad0cdb5faL, 0x59e86297d87f5733L, 0x298ef221898db0e7L, 0x55000029d1a5aa7eL, 0x8bc08ae1b5061b45L, 0xc2c31c2b6c92703aL, 0x94cc596baf25ef42L, 
        0xa1d73db22540456L, 0x4b6a0f9d9c4179aL, 0xeffdafa2ae3d3c60L, 0xf7c8075bb49496c4L, 0x9cc5c7141d1cd4e3L, 0x78bd1638218e5534L, 0xb2f11568f850246aL, 0xedfabcfa9502bc29L, 0x796ce5f2da23051bL, 0xaae128b0dc93537cL, 
        0x3a493da0ee4b29aeL, 0xb5df6b2c416895d7L, 0xfcabbd25122d7f37L, 0x70810b58105dc4b1L, 0xe10fdd37f7882a90L, 0x524dcab5518a3f5cL, 0x3c9e85878451255bL, 0x4029828119bd34e2L, 0x74a05b6f5d3ceccbL, 0xb610021542e13ecaL, 
        0xff979d12f59e2acL, 0x6037da27e4f9cc50L, 0x5e92975a0df1847dL, 0xd66de190d3e623feL, 0x5032d6b87b568048L, 0x9a36b7ce8235216eL, 0x80272a7a24f64b4aL, 0x93efed8b8c6916f7L, 0x37ddbff44cce1555L, 0x4b95db5d4b99bd25L, 
        0x92d3fda169812fc0L, 0xfb1a4a9a90660bb6L, 0x730c196946a4b9b2L, 0x81e289aa7f49da68L, 0x64669a0f83b1a05fL, 0x27b3ff7d9644f48bL, 0xcc6b615c8db675b3L, 0x674f20b9bcebbe95L, 0x6f31238275655982L, 0x5ae488713e45cf05L, 
        0xbf619f9954c21157L, 0xeabac46040a8eae9L, 0x454c6fe9f2c0c1cdL, 0x419cf6496412691cL, 0xd3dc3bef265b0f70L, 0x6d0e60f5c3578a9eL
    };
    private static final long t4[] = {
        0x5b0e608526323c55L, 0x1a46c1a9fa1b59f5L, 0xa9e245a17c4c8ffaL, 0x65ca5159db2955d7L, 0x5db0a76ce35afc2L, 0x81eac77ea9113d45L, 0x528ef88ab6ac0a0dL, 0xa09ea253597be3ffL, 0x430ddfb3ac48cd56L, 0xc4b3a67af45ce46fL, 
        0x4ececfd8fbe2d05eL, 0x3ef56f10b39935f0L, 0xb22d6829cd619c6L, 0x17fd460a74df2069L, 0x6cf8cc8e8510ed40L, 0xd6c824bf3a6ecaa7L, 0x61243d581a817049L, 0x48bacb6bbc163a2L, 0xd9a38ac27d44cc32L, 0x7fddff5baaf410abL, 
        0xad6d495aa804824bL, 0xe1a6a74f2d8c9f94L, 0xd4f7851235dee8e3L, 0xfd4b7f886540d893L, 0x247c20042aa4bfdaL, 0x96ea1c517d1327cL, 0xd56966b4361a6685L, 0x277da5c31221057dL, 0x94d59893a43acff7L, 0x64f0c51ccdc02281L, 
        0x3d33bcc4ff6189dbL, 0xe005cb184ce66af1L, 0xff5ccd1d1db99beaL, 0xb0b854a7fe42980fL, 0x7bd46a6a718d4b9fL, 0xd10fa8cc22a5fd8cL, 0xd31484952be4bd31L, 0xc7fa975fcb243847L, 0x4886ed1e5846c407L, 0x28cddb791eb70b04L, 
        0xc2b00be2f573417fL, 0x5c9590452180f877L, 0x7a6bddfff370eb00L, 0xce509e38d6d9d6a4L, 0xebeb0f00647fa702L, 0x1dcc06cf76606f06L, 0xe4d9f28ba286ff0aL, 0xd85a305dc918c262L, 0x475b1d8732225f54L, 0x2d4fb51668ccb5feL, 
        0xa679b9d9d72bba20L, 0x53841c0d912d43a5L, 0x3b7eaa48bf12a4e8L, 0x781e0e47f22f1ddfL, 0xeff20ce60ab50973L, 0x20d261d19dffb742L, 0x16a12b03062a2e39L, 0x1960eb2239650495L, 0x251c16fed50eb8b8L, 0x9ac0c330f826016eL, 
        0xed152665953e7671L, 0x2d63194a6369570L, 0x5074f08394b1c987L, 0x70ba598c90b25ce1L, 0x794a15810b9742f6L, 0xd5925e9fcaf8c6cL, 0x3067716cd868744eL, 0x910ab077e8d7731bL, 0x6a61bbdb5ac42f61L, 0x93513efbf0851567L, 
        0xf494724b9e83e9d5L, 0xe887e1985c09648dL, 0x34b1d3c675370cfdL, 0xdc35e433bc0d255dL, 0xd0aab84234131be0L, 0x8042a50b48b7eafL, 0x9997c4ee44a3ab35L, 0x829a7b49201799d0L, 0x263b8307b7c54441L, 0x752f95f4fd6a6ca6L, 
        0x927217402c08c6e5L, 0x2a8ab754a795d9eeL, 0xa442f7552f72943dL, 0x2c31334e19781208L, 0x4fa98d7ceaee6291L, 0x55c3862f665db309L, 0xbd0610175d53b1f3L, 0x46fe6cb840413f27L, 0x3fe03792df0cfa59L, 0xcfe700372eb85e8fL, 
        0xa7be29e7adbce118L, 0xe544ee5cde8431ddL, 0x8a781b1b41f1873eL, 0xa5c94c78a0d2f0e7L, 0x39412e2877b60728L, 0xa1265ef3afc9a62cL, 0xbcc2770c6a2506c5L, 0x3ab66dd5dce1ce12L, 0xe65499d04a675b37L, 0x7d8f523481bfd216L, 
        0xf6f64fcec15f389L, 0x74efbe618b5b13c8L, 0xacdc82b714273e1dL, 0xdd40bfe003199d17L, 0x37e99257e7e061f8L, 0xfa52626904775aaaL, 0x8bbbf63a463d56f9L, 0xf0013f1543a26e64L, 0xa8307e9f879ec898L, 0xcc4c27a4150177ccL, 
        0x1b432f2cca1d3348L, 0xde1d1f8f9f6fa013L, 0x606602a047a7ddd6L, 0xd237ab64cc1cb2c7L, 0x9b938e7225fcd1d3L, 0xec4e03708e0ff476L, 0xfeb2fbda3d03c12dL, 0xae0bced2ee43889aL, 0x22cb8923ebfb4f43L, 0x69360d013cf7396dL, 
        0x855e3602d2d4e022L, 0x73805bad01f784cL, 0x33e17a133852f546L, 0xdf4874058ac7b638L, 0xba92b29c678aa14aL, 0xce89fc76cfaadcdL, 0x5f9d4e0908339e34L, 0xf1afe9291f5923b9L, 0x6e3480f60f4a265fL, 0xeebf3a2ab29b841cL, 
        0xe21938a88f91b4adL, 0x57dfeff845c6d3c3L, 0x2f006b0bf62caaf2L, 0x62f479ef6f75ee78L, 0x11a55ad41c8916a9L, 0xf229d29084fed453L, 0x42f1c27b16b000e6L, 0x2b1f76749823c074L, 0x4b76eca3c2745360L, 0x8c98f463b91691bdL, 
        0x14bcc93cf1ade66aL, 0x8885213e6d458397L, 0x8e177df0274d4711L, 0xb49b73b5503f2951L, 0x10168168c3f96b6bL, 0xe3d963b63cab0aeL, 0x8dfc4b5655a1db14L, 0xf789f1356e14de5cL, 0x683e68af4e51dac1L, 0xc9a84f9d8d4b0fd9L, 
        0x3691e03f52a0f9d1L, 0x5ed86e46e1878e80L, 0x3c711a0e99d07150L, 0x5a0865b20c4e9310L, 0x56fbfc1fe4f0682eL, 0xea8d5de3105edf9bL, 0x71abfdb12379187aL, 0x2eb99de1bee77b9cL, 0x21ecc0ea33cf4523L, 0x59a4d7521805c7a1L, 
        0x3896f5eb56ae7c72L, 0xaa638f3db18f75dcL, 0x9f39358dabe9808eL, 0xb7defa91c00b72acL, 0x6b5541fd62492d92L, 0x6dc6dee8f92e4d5bL, 0x353f57abc4beea7eL, 0x735769d6da5690ceL, 0xa234aa642391484L, 0xf6f9508028f80d9dL, 
        0xb8e319a27ab3f215L, 0x31ad9c1151341a4dL, 0x773c22a57bef5805L, 0x45c7561a07968633L, 0xf913da9e249dbe36L, 0xda652d9b78a64c68L, 0x4c27a97f3bc334efL, 0x76621220e66b17f4L, 0x967743899acd7d0bL, 0xf3ee5bcae0ed6782L, 
        0x409f753600c879fcL, 0x6d09a39b5926db6L, 0x6f83aeb0317ac588L, 0x1e6ca4a86381f21L, 0x66ff3462d19f3025L, 0x72207c24ddfd3bfbL, 0x4af6b6d3e2ece2ebL, 0x9c994dbec7ea08deL, 0x49ace597b09a8bc4L, 0xb38c4766cf0797baL, 
        0x131b9373c57c2a75L, 0xb1822cce61931e58L, 0x9d7555b909ba1c0cL, 0x127fafdd937d11d2L, 0x29da3badc66d92e4L, 0xa2c1d57154c2ecbcL, 0x58c5134d82f6fe24L, 0x1c3ae3515b62274fL, 0xe907c82e01cb8126L, 0xf8ed091913e37fcbL, 
        0x3249d8f9c80046c9L, 0x80cf9bede388fb63L, 0x1881539a116cf19eL, 0x5103f3f76bd52457L, 0x15b7e6f5ae47f7a8L, 0xdbd7c6ded47e9ccfL, 0x44e55c410228bb1aL, 0xb647d4255edb4e99L, 0x5d11882bb8aafc30L, 0xf5098bbb29d3212aL, 
        0x8fb5ea14e90296b3L, 0x677b942157dd025aL, 0xfb58e7c0a390acb5L, 0x89d3674c83bd4a01L, 0x9e2da4df4bf3b93bL, 0xfcc41e328cab4829L, 0x3f38c96ba582c52L, 0xcad1bdbd7fd85db2L, 0xbbb442c16082ae83L, 0xb95fe86ba5da9ab0L, 
        0xb22e04673771a93fL, 0x845358c9493152d8L, 0xbe2a488697b4541eL, 0x95a2dc2dd38e6966L, 0xc02c11ac923c852bL, 0x2388b1990df2a87bL, 0x7c8008fa1b4f37beL, 0x1f70d0c84d54e503L, 0x5490adec7ece57d4L, 0x2b3c27d9063a3aL, 
        0x7eaea3848030a2bfL, 0xc602326ded2003c0L, 0x83a7287d69a94086L, 0xc57a5fcb30f57a8aL, 0xb56844e479ebe779L, 0xa373b40f05dcbce9L, 0xd71a786e88570ee2L, 0x879cbacdbde8f6a0L, 0x976ad1bcc164a32fL, 0xab21e25e9666d78bL, 
        0x901063aae5e5c33cL, 0x9818b34448698d90L, 0xe36487ae3e1e8abbL, 0xafbdf931893bdcb4L, 0x6345a0dc5fbbd519L, 0x8628fe269b9465caL, 0x1e5d01603f9c51ecL, 0x4de44006a15049b7L, 0xbf6c70e5f776cbb1L, 0x411218f2ef552bedL, 
        0xcb0c0708705a36a3L, 0xe74d14754f986044L, 0xcd56d9430ea8280eL, 0xc12591d7535f5065L, 0xc83223f1720aef96L, 0xc3a0396f7363a51fL
    };
    private long a;
    private long b;
    private int bOff;
    private byte buf[];
    private long byteCount;
    private long c;
    private long x[];
    private int xOff;

    public TigerDigest()
    {
        buf = new byte[8];
        bOff = 0;
        x = new long[8];
        xOff = 0;
        reset();
    }

    public TigerDigest(TigerDigest tigerdigest)
    {
        buf = new byte[8];
        bOff = 0;
        x = new long[8];
        xOff = 0;
        a = tigerdigest.a;
        b = tigerdigest.b;
        c = tigerdigest.c;
        System.arraycopy(tigerdigest.x, 0, x, 0, tigerdigest.x.length);
        xOff = tigerdigest.xOff;
        System.arraycopy(tigerdigest.buf, 0, buf, 0, tigerdigest.buf.length);
        bOff = tigerdigest.bOff;
        byteCount = tigerdigest.byteCount;
    }

    private void finish()
    {
        long l = byteCount;
        update((byte)1);
        while (bOff != 0) 
        {
            update((byte)0);
        }
        processLength(l << 3);
        processBlock();
    }

    private void keySchedule()
    {
        long al[] = x;
        al[0] = al[0] - (x[7] ^ 0xa5a5a5a5a5a5a5a5L);
        al = x;
        al[1] = al[1] ^ x[0];
        al = x;
        al[2] = al[2] + x[1];
        al = x;
        al[3] = al[3] - (x[2] ^ ~x[1] << 19);
        al = x;
        al[4] = al[4] ^ x[3];
        al = x;
        al[5] = al[5] + x[4];
        al = x;
        al[6] = al[6] - (x[5] ^ ~x[4] >>> 23);
        al = x;
        al[7] = al[7] ^ x[6];
        al = x;
        al[0] = al[0] + x[7];
        al = x;
        al[1] = al[1] - (x[0] ^ ~x[7] << 19);
        al = x;
        al[2] = al[2] ^ x[1];
        al = x;
        al[3] = al[3] + x[2];
        al = x;
        al[4] = al[4] - (x[3] ^ ~x[2] >>> 23);
        al = x;
        al[5] = al[5] ^ x[4];
        al = x;
        al[6] = al[6] + x[5];
        al = x;
        al[7] = al[7] - (x[6] ^ 0x123456789abcdefL);
    }

    private void processBlock()
    {
        long l = a;
        long l1 = b;
        long l2 = c;
        roundABC(x[0], 5L);
        roundBCA(x[1], 5L);
        roundCAB(x[2], 5L);
        roundABC(x[3], 5L);
        roundBCA(x[4], 5L);
        roundCAB(x[5], 5L);
        roundABC(x[6], 5L);
        roundBCA(x[7], 5L);
        keySchedule();
        roundCAB(x[0], 7L);
        roundABC(x[1], 7L);
        roundBCA(x[2], 7L);
        roundCAB(x[3], 7L);
        roundABC(x[4], 7L);
        roundBCA(x[5], 7L);
        roundCAB(x[6], 7L);
        roundABC(x[7], 7L);
        keySchedule();
        roundBCA(x[0], 9L);
        roundCAB(x[1], 9L);
        roundABC(x[2], 9L);
        roundBCA(x[3], 9L);
        roundCAB(x[4], 9L);
        roundABC(x[5], 9L);
        roundBCA(x[6], 9L);
        roundCAB(x[7], 9L);
        a = l ^ a;
        b = b - l1;
        c = c + l2;
        xOff = 0;
        for (int i = 0; i != x.length; i++)
        {
            x[i] = 0L;
        }

    }

    private void processLength(long l)
    {
        x[7] = l;
    }

    private void processWord(byte abyte0[], int i)
    {
        long al[] = x;
        int j = xOff;
        xOff = j + 1;
        al[j] = (long)(abyte0[i + 7] & 0xff) << 56 | (long)(abyte0[i + 6] & 0xff) << 48 | (long)(abyte0[i + 5] & 0xff) << 40 | (long)(abyte0[i + 4] & 0xff) << 32 | (long)(abyte0[i + 3] & 0xff) << 24 | (long)(abyte0[i + 2] & 0xff) << 16 | (long)(abyte0[i + 1] & 0xff) << 8 | (long)(abyte0[i + 0] & 0xff);
        if (xOff == x.length)
        {
            processBlock();
        }
        bOff = 0;
    }

    private void roundABC(long l, long l1)
    {
        c = c ^ l;
        a = a - (t1[(int)c & 0xff] ^ t2[(int)(c >> 16) & 0xff] ^ t3[(int)(c >> 32) & 0xff] ^ t4[(int)(c >> 48) & 0xff]);
        b = b + (t4[(int)(c >> 8) & 0xff] ^ t3[(int)(c >> 24) & 0xff] ^ t2[(int)(c >> 40) & 0xff] ^ t1[(int)(c >> 56) & 0xff]);
        b = b * l1;
    }

    private void roundBCA(long l, long l1)
    {
        a = a ^ l;
        b = b - (t1[(int)a & 0xff] ^ t2[(int)(a >> 16) & 0xff] ^ t3[(int)(a >> 32) & 0xff] ^ t4[(int)(a >> 48) & 0xff]);
        c = c + (t4[(int)(a >> 8) & 0xff] ^ t3[(int)(a >> 24) & 0xff] ^ t2[(int)(a >> 40) & 0xff] ^ t1[(int)(a >> 56) & 0xff]);
        c = c * l1;
    }

    private void roundCAB(long l, long l1)
    {
        b = b ^ l;
        c = c - (t1[(int)b & 0xff] ^ t2[(int)(b >> 16) & 0xff] ^ t3[(int)(b >> 32) & 0xff] ^ t4[(int)(b >> 48) & 0xff]);
        a = a + (t4[(int)(b >> 8) & 0xff] ^ t3[(int)(b >> 24) & 0xff] ^ t2[(int)(b >> 40) & 0xff] ^ t1[(int)(b >> 56) & 0xff]);
        a = a * l1;
    }

    public int doFinal(byte abyte0[], int i)
    {
        finish();
        unpackWord(a, abyte0, i);
        unpackWord(b, abyte0, i + 8);
        unpackWord(c, abyte0, i + 16);
        reset();
        return 24;
    }

    public String getAlgorithmName()
    {
        return "Tiger";
    }

    public int getByteLength()
    {
        return 64;
    }

    public int getDigestSize()
    {
        return 24;
    }

    public void reset()
    {
        a = 0x123456789abcdefL;
        b = 0xfedcba9876543210L;
        c = 0xf096a5b4c3b2e187L;
        xOff = 0;
        for (int i = 0; i != x.length; i++)
        {
            x[i] = 0L;
        }

        bOff = 0;
        for (int j = 0; j != buf.length; j++)
        {
            buf[j] = 0;
        }

        byteCount = 0L;
    }

    public void unpackWord(long l, byte abyte0[], int i)
    {
        abyte0[i + 7] = (byte)(int)(l >> 56);
        abyte0[i + 6] = (byte)(int)(l >> 48);
        abyte0[i + 5] = (byte)(int)(l >> 40);
        abyte0[i + 4] = (byte)(int)(l >> 32);
        abyte0[i + 3] = (byte)(int)(l >> 24);
        abyte0[i + 2] = (byte)(int)(l >> 16);
        abyte0[i + 1] = (byte)(int)(l >> 8);
        abyte0[i] = (byte)(int)l;
    }

    public void update(byte byte0)
    {
        byte abyte0[] = buf;
        int i = bOff;
        bOff = i + 1;
        abyte0[i] = byte0;
        if (bOff == buf.length)
        {
            processWord(buf, 0);
        }
        byteCount = byteCount + 1L;
    }

    public void update(byte abyte0[], int i, int j)
    {
_L2:
        do
        {
            int k = i;
            int i1 = j;
            if (i > 8)
            {
                processWord(abyte0, j);
                byteCount = byteCount + 8L;
                i -= 8;
                j += 8;
            } else
            {
                for (; k > 0; k--)
                {
                    update(abyte0[i1]);
                    i1++;
                }

                return;
            }
        } while (true);
        for (; bOff != 0 && j > 0; j--)
        {
            update(abyte0[i]);
            i++;
        }

        int l = i;
        i = j;
        j = l;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
