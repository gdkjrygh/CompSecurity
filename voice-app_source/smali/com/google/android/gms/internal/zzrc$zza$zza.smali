.class public final Lcom/google/android/gms/internal/zzrc$zza$zza;
.super Lcom/google/android/gms/internal/zzrh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzrc$zza;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzrc$zza$zza$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzrh",
        "<",
        "Lcom/google/android/gms/internal/zzrc$zza$zza;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile zzaVo:[Lcom/google/android/gms/internal/zzrc$zza$zza;


# instance fields
.field public type:I

.field public zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzrh;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzBo()Lcom/google/android/gms/internal/zzrc$zza$zza;

    return-void
.end method

.method public static zzBn()[Lcom/google/android/gms/internal/zzrc$zza$zza;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVo:[Lcom/google/android/gms/internal/zzrc$zza$zza;

    if-nez v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/zzrl;->zzaWe:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVo:[Lcom/google/android/gms/internal/zzrc$zza$zza;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/internal/zzrc$zza$zza;

    sput-object v0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVo:[Lcom/google/android/gms/internal/zzrc$zza$zza;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVo:[Lcom/google/android/gms/internal/zzrc$zza$zza;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    const/4 v0, 0x1

    .end local p1    # "o":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "o":Ljava/lang/Object;
    :cond_1
    instance-of v1, p1, Lcom/google/android/gms/internal/zzrc$zza$zza;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/zzrc$zza$zza;

    .end local p1    # "o":Ljava/lang/Object;
    iget v1, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->type:I

    iget v2, p1, Lcom/google/android/gms/internal/zzrc$zza$zza;->type:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    if-nez v1, :cond_0

    :cond_2
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzrc$zza$zza;->zza(Lcom/google/android/gms/internal/zzrh;)Z

    move-result v0

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    iget-object v2, p1, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzrc$zza$zza$zza;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->type:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzBI()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzrc$zza$zza$zza;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method protected zzB()I
    .locals 3

    invoke-super {p0}, Lcom/google/android/gms/internal/zzrh;->zzB()I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->type:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzrg;->zzA(II)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzrg;->zzc(ILcom/google/android/gms/internal/zzrn;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    return v0
.end method

.method public zzBo()Lcom/google/android/gms/internal/zzrc$zza$zza;
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->type:I

    iput-object v1, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVU:Lcom/google/android/gms/internal/zzrj;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaWf:I

    return-object p0
.end method

.method public zza(Lcom/google/android/gms/internal/zzrg;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->type:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzrg;->zzy(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzrg;->zza(ILcom/google/android/gms/internal/zzrn;)V

    :cond_0
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzrh;->zza(Lcom/google/android/gms/internal/zzrg;)V

    return-void
.end method

.method public synthetic zzb(Lcom/google/android/gms/internal/zzrf;)Lcom/google/android/gms/internal/zzrn;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzx(Lcom/google/android/gms/internal/zzrf;)Lcom/google/android/gms/internal/zzrc$zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public zzx(Lcom/google/android/gms/internal/zzrf;)Lcom/google/android/gms/internal/zzrc$zza$zza;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzrf;->zzBr()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzrc$zza$zza;->zza(Lcom/google/android/gms/internal/zzrf;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzrf;->zzBu()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iput v0, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->type:I

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzrc$zza$zza$zza;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzrc$zza$zza;->zzaVp:Lcom/google/android/gms/internal/zzrc$zza$zza$zza;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzrf;->zza(Lcom/google/android/gms/internal/zzrn;)V

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
