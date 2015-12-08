.class public final Lcom/google/android/gms/appdatasearch/UsageInfo$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/appdatasearch/UsageInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation


# instance fields
.field private zzHZ:Ljava/lang/String;

.field private zzNH:Lcom/google/android/gms/appdatasearch/DocumentId;

.field private zzNI:J

.field private zzNJ:I

.field private zzNK:Lcom/google/android/gms/appdatasearch/DocumentContents;

.field private zzNL:Z

.field private zzNM:I

.field private zzNN:I


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNI:J

    iput v2, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNJ:I

    iput v2, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNM:I

    iput-boolean v3, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNL:Z

    iput v3, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNN:I

    return-void
.end method


# virtual methods
.method public zzL(Z)Lcom/google/android/gms/appdatasearch/UsageInfo$zza;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNL:Z

    return-object p0
.end method

.method public zza(Lcom/google/android/gms/appdatasearch/DocumentContents;)Lcom/google/android/gms/appdatasearch/UsageInfo$zza;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNK:Lcom/google/android/gms/appdatasearch/DocumentContents;

    return-object p0
.end method

.method public zza(Lcom/google/android/gms/appdatasearch/DocumentId;)Lcom/google/android/gms/appdatasearch/UsageInfo$zza;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNH:Lcom/google/android/gms/appdatasearch/DocumentId;

    return-object p0
.end method

.method public zzal(I)Lcom/google/android/gms/appdatasearch/UsageInfo$zza;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNJ:I

    return-object p0
.end method

.method public zzam(I)Lcom/google/android/gms/appdatasearch/UsageInfo$zza;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNN:I

    return-object p0
.end method

.method public zzkN()Lcom/google/android/gms/appdatasearch/UsageInfo;
    .locals 11

    new-instance v0, Lcom/google/android/gms/appdatasearch/UsageInfo;

    iget-object v1, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNH:Lcom/google/android/gms/appdatasearch/DocumentId;

    iget-wide v2, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNI:J

    iget v4, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNJ:I

    iget-object v5, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzHZ:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNK:Lcom/google/android/gms/appdatasearch/DocumentContents;

    iget-boolean v7, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNL:Z

    iget v8, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNM:I

    iget v9, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNN:I

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/appdatasearch/UsageInfo;-><init>(Lcom/google/android/gms/appdatasearch/DocumentId;JILjava/lang/String;Lcom/google/android/gms/appdatasearch/DocumentContents;ZIILcom/google/android/gms/appdatasearch/UsageInfo$1;)V

    return-object v0
.end method

.method public zzw(J)Lcom/google/android/gms/appdatasearch/UsageInfo$zza;
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/appdatasearch/UsageInfo$zza;->zzNI:J

    return-object p0
.end method
