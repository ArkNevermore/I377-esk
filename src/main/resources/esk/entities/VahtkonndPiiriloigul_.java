package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.865+0200")
@StaticMetamodel(VahtkonndPiiriloigul.class)
public class VahtkonndPiiriloigul_ {
	public static volatile SingularAttribute<VahtkonndPiiriloigul, Integer> vahtkondPiiriloiulId;
	public static volatile SingularAttribute<VahtkonndPiiriloigul, Date> alates;
	public static volatile SingularAttribute<VahtkonndPiiriloigul, String> avaja;
	public static volatile SingularAttribute<VahtkonndPiiriloigul, Date> avatud;
	public static volatile SingularAttribute<VahtkonndPiiriloigul, String> kommentaar;
	public static volatile SingularAttribute<VahtkonndPiiriloigul, Date> kuni;
	public static volatile SingularAttribute<VahtkonndPiiriloigul, Date> muudetud;
	public static volatile SingularAttribute<VahtkonndPiiriloigul, String> muutja;
	public static volatile SingularAttribute<VahtkonndPiiriloigul, Date> suletud;
	public static volatile SingularAttribute<VahtkonndPiiriloigul, String> sulgeja;
	public static volatile SingularAttribute<VahtkonndPiiriloigul, Piiriloik> piiriloik;
	public static volatile SingularAttribute<VahtkonndPiiriloigul, Vahtkond> vahtkond;
}
