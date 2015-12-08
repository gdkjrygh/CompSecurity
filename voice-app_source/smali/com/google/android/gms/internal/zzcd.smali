.class public Lcom/google/android/gms/internal/zzcd;
.super Ljava/lang/Object;


# instance fields
.field private final zzuL:J

.field private final zzuM:Ljava/lang/String;

.field private final zzuN:Lcom/google/android/gms/internal/zzcd;


# direct methods
.method public constructor <init>(JLjava/lang/String;Lcom/google/android/gms/internal/zzcd;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzcd;->zzuL:J

    iput-object p3, p0, Lcom/google/android/gms/internal/zzcd;->zzuM:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzcd;->zzuN:Lcom/google/android/gms/internal/zzcd;

    return-void
.end method


# virtual methods
.method getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzcd;->zzuL:J

    return-wide v0
.end method

.method zzdm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzcd;->zzuM:Ljava/lang/String;

    return-object v0
.end method

.method zzdn()Lcom/google/android/gms/internal/zzcd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzcd;->zzuN:Lcom/google/android/gms/internal/zzcd;

    return-object v0
.end method
