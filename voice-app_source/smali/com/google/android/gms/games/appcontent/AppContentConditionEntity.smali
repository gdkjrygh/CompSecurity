.class public final Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
.implements Lcom/google/android/gms/games/appcontent/AppContentCondition;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/games/appcontent/AppContentConditionEntityCreator;


# instance fields
.field private final zzCY:I

.field private final zzaoA:Ljava/lang/String;

.field private final zzaoB:Ljava/lang/String;

.field private final zzaoC:Landroid/os/Bundle;

.field private final zzaoz:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntityCreator;

    invoke-direct {v0}, Lcom/google/android/gms/games/appcontent/AppContentConditionEntityCreator;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->CREATOR:Lcom/google/android/gms/games/appcontent/AppContentConditionEntityCreator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "defaultValue"    # Ljava/lang/String;
    .param p3, "expectedValue"    # Ljava/lang/String;
    .param p4, "predicate"    # Ljava/lang/String;
    .param p5, "predicateParameters"    # Landroid/os/Bundle;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzaoz:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzaoA:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzaoB:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzaoC:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/games/appcontent/AppContentCondition;)V
    .locals 1
    .param p1, "condition"    # Lcom/google/android/gms/games/appcontent/AppContentCondition;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzCY:I

    invoke-interface {p1}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzse()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzaoz:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsf()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzaoA:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsg()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzaoB:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsh()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzaoC:Landroid/os/Bundle;

    return-void
.end method

.method static zza(Lcom/google/android/gms/games/appcontent/AppContentCondition;)I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-interface {p0}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzse()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-interface {p0}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsf()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-interface {p0}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsg()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-interface {p0}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsh()Landroid/os/Bundle;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzt;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method static zza(Lcom/google/android/gms/games/appcontent/AppContentCondition;Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    instance-of v2, p1, Lcom/google/android/gms/games/appcontent/AppContentCondition;

    if-nez v2, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eq p0, p1, :cond_0

    check-cast p1, Lcom/google/android/gms/games/appcontent/AppContentCondition;

    invoke-interface {p1}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzse()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzse()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsf()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsf()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsg()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsg()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsh()Landroid/os/Bundle;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsh()Landroid/os/Bundle;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method static zzb(Lcom/google/android/gms/games/appcontent/AppContentCondition;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzt;->zzt(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "DefaultValue"

    invoke-interface {p0}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzse()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "ExpectedValue"

    invoke-interface {p0}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsf()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "Predicate"

    invoke-interface {p0}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "PredicateParameters"

    invoke-interface {p0}, Lcom/google/android/gms/games/appcontent/AppContentCondition;->zzsh()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/zzt$zza;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    invoke-static {p0, p1}, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zza(Lcom/google/android/gms/games/appcontent/AppContentCondition;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzsi()Lcom/google/android/gms/games/appcontent/AppContentCondition;

    move-result-object v0

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzCY:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zza(Lcom/google/android/gms/games/appcontent/AppContentCondition;)I

    move-result v0

    return v0
.end method

.method public isDataValid()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzb(Lcom/google/android/gms/games/appcontent/AppContentCondition;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/appcontent/AppContentConditionEntityCreator;->zza(Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzse()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzaoz:Ljava/lang/String;

    return-object v0
.end method

.method public zzsf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzaoA:Ljava/lang/String;

    return-object v0
.end method

.method public zzsg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzaoB:Ljava/lang/String;

    return-object v0
.end method

.method public zzsh()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentConditionEntity;->zzaoC:Landroid/os/Bundle;

    return-object v0
.end method

.method public zzsi()Lcom/google/android/gms/games/appcontent/AppContentCondition;
    .locals 0

    return-object p0
.end method
