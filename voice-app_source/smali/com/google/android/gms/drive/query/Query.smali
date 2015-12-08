.class public Lcom/google/android/gms/drive/query/Query;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/query/Query$1;,
        Lcom/google/android/gms/drive/query/Query$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/query/Query;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field final zzadR:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;"
        }
    .end annotation
.end field

.field private final zzadS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;"
        }
    .end annotation
.end field

.field final zzahG:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

.field final zzahH:Ljava/lang/String;

.field final zzahI:Lcom/google/android/gms/drive/query/SortOrder;

.field final zzahJ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final zzahK:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/query/zza;

    invoke-direct {v0}, Lcom/google/android/gms/drive/query/zza;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/query/Query;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;Ljava/util/List;ZLjava/util/List;)V
    .locals 10
    .param p1, "versionCode"    # I
    .param p2, "clause"    # Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    .param p3, "pageToken"    # Ljava/lang/String;
    .param p4, "sortOrder"    # Lcom/google/android/gms/drive/query/SortOrder;
    .param p6, "shouldIncludeParents"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/drive/query/internal/LogicalFilter;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/drive/query/SortOrder;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p5, "requestedMetadataFields":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .local p7, "spacesList":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/drive/DriveSpace;>;"
    if-nez p7, :cond_0

    const/4 v9, 0x0

    :goto_0
    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/drive/query/Query;-><init>(ILcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;Ljava/util/List;ZLjava/util/List;Ljava/util/Set;)V

    return-void

    :cond_0
    new-instance v9, Ljava/util/HashSet;

    move-object/from16 v0, p7

    invoke-direct {v9, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_0
.end method

.method private constructor <init>(ILcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;Ljava/util/List;ZLjava/util/List;Ljava/util/Set;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "clause"    # Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    .param p3, "pageToken"    # Ljava/lang/String;
    .param p4, "sortOrder"    # Lcom/google/android/gms/drive/query/SortOrder;
    .param p6, "shouldIncludeParents"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/drive/query/internal/LogicalFilter;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/drive/query/SortOrder;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p5, "requestedMetadataFields":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .local p7, "spacesList":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/drive/DriveSpace;>;"
    .local p8, "spaces":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/android/gms/drive/DriveSpace;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/query/Query;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/drive/query/Query;->zzahG:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    iput-object p3, p0, Lcom/google/android/gms/drive/query/Query;->zzahH:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/drive/query/Query;->zzahI:Lcom/google/android/gms/drive/query/SortOrder;

    iput-object p5, p0, Lcom/google/android/gms/drive/query/Query;->zzahJ:Ljava/util/List;

    iput-boolean p6, p0, Lcom/google/android/gms/drive/query/Query;->zzahK:Z

    iput-object p7, p0, Lcom/google/android/gms/drive/query/Query;->zzadR:Ljava/util/List;

    iput-object p8, p0, Lcom/google/android/gms/drive/query/Query;->zzadS:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;Ljava/util/List;ZLjava/util/Set;)V
    .locals 9
    .param p1, "clause"    # Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    .param p2, "pageToken"    # Ljava/lang/String;
    .param p3, "sortOrder"    # Lcom/google/android/gms/drive/query/SortOrder;
    .param p5, "shouldIncludeParents"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/drive/query/internal/LogicalFilter;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/drive/query/SortOrder;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p4, "requestedMetadataFields":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .local p6, "spaces":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/android/gms/drive/DriveSpace;>;"
    const/4 v1, 0x1

    if-nez p6, :cond_0

    const/4 v7, 0x0

    :goto_0
    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/drive/query/Query;-><init>(ILcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;Ljava/util/List;ZLjava/util/List;Ljava/util/Set;)V

    return-void

    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, p6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;Ljava/util/List;ZLjava/util/Set;Lcom/google/android/gms/drive/query/Query$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    .param p2, "x1"    # Ljava/lang/String;
    .param p3, "x2"    # Lcom/google/android/gms/drive/query/SortOrder;
    .param p4, "x3"    # Ljava/util/List;
    .param p5, "x4"    # Z
    .param p6, "x5"    # Ljava/util/Set;
    .param p7, "x6"    # Lcom/google/android/gms/drive/query/Query$1;

    .prologue
    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/drive/query/Query;-><init>(Lcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;Ljava/util/List;ZLjava/util/Set;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getFilter()Lcom/google/android/gms/drive/query/Filter;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/query/Query;->zzahG:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    return-object v0
.end method

.method public getPageToken()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/query/Query;->zzahH:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()Lcom/google/android/gms/drive/query/SortOrder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/query/Query;->zzahI:Lcom/google/android/gms/drive/query/SortOrder;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "Query[%s,%s,PageToken=%s,Spaces=%s]"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/google/android/gms/drive/query/Query;->zzahG:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/google/android/gms/drive/query/Query;->zzahI:Lcom/google/android/gms/drive/query/SortOrder;

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/google/android/gms/drive/query/Query;->zzahH:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/google/android/gms/drive/query/Query;->zzadR:Ljava/util/List;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/zza;->zza(Lcom/google/android/gms/drive/query/Query;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzpZ()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/query/Query;->zzahJ:Ljava/util/List;

    return-object v0
.end method

.method public zzqa()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/drive/query/Query;->zzahK:Z

    return v0
.end method

.method public zzqb()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/query/Query;->zzadS:Ljava/util/Set;

    return-object v0
.end method
