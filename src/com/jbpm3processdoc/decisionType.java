////////////////////////////////////////////////////////////////////////
//
// decisionType.java
//
// This file was generated by XMLSpy 2009sp1 Enterprise Edition.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the XMLSpy Documentation for further details.
// http://www.altova.com/xmlspy
//
////////////////////////////////////////////////////////////////////////

package com.jbpm3processdoc;


public class decisionType extends com.migration.xml.TypeBase
{
		public static com.migration.xml.meta.ComplexType getStaticInfo() { return new com.migration.xml.meta.ComplexType(com.jbpm3processdoc.jbpm3processdoc_TypeInfo.binder.getTypes()[com.jbpm3processdoc.jbpm3processdoc_TypeInfo._altova_ti_altova_decisionType]); }
	
	public decisionType(org.w3c.dom.Node init)
	{
		super(init);
		instantiateMembers();
	}
	
	private void instantiateMembers()
	{
		name = new MemberAttribute_name (this, com.jbpm3processdoc.jbpm3processdoc_TypeInfo.binder.getMembers()[com.jbpm3processdoc.jbpm3processdoc_TypeInfo._altova_mi_altova_decisionType._name]);

		description= new MemberElement_description (this, com.jbpm3processdoc.jbpm3processdoc_TypeInfo.binder.getMembers()[com.jbpm3processdoc.jbpm3processdoc_TypeInfo._altova_mi_altova_decisionType._description]);
		transition= new MemberElement_transition (this, com.jbpm3processdoc.jbpm3processdoc_TypeInfo.binder.getMembers()[com.jbpm3processdoc.jbpm3processdoc_TypeInfo._altova_mi_altova_decisionType._transition]);
	}
	// Attributes
	public MemberAttribute_name name;
		public static class MemberAttribute_name
		{
			private com.migration.xml.TypeBase owner;
			private com.migration.typeinfo.MemberInfo info; 
			public MemberAttribute_name (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) {this.owner = owner; this.info = info;}
			public String getValue() {
				return (String)com.migration.xml.XmlTreeOperations.castToString(com.migration.xml.XmlTreeOperations.findAttribute(owner.getNode(), info), info);
			}
			public void setValue(String value) {
				com.migration.xml.XmlTreeOperations.setValue(owner.getNode(), info, value);		
			}
			public boolean exists() {return owner.getAttribute(info) != null;}
			public void remove() {owner.removeAttribute(info);} 
			public com.migration.xml.meta.Attribute getInfo() {return new com.migration.xml.meta.Attribute(info);}
		}


	// Elements
	
	public MemberElement_description description;

		public static class MemberElement_description
		{
			public static class MemberElement_description_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_description member;
				public MemberElement_description_Iterator(MemberElement_description member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
				public boolean hasNext() 
				{
					while (nextNode != null)
					{
						if (com.migration.xml.TypeBase.memberEqualsNode(member.info, nextNode))
							return true;
						nextNode = nextNode.getNextSibling();
					}
					return false;
				}
				
				public Object next()
				{
					com.jbpm3processdoc.xs.stringType nx = new com.jbpm3processdoc.xs.stringType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_description (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public com.jbpm3processdoc.xs.stringType at(int index) {return new com.jbpm3processdoc.xs.stringType(owner.getElementAt(info, index));}
			public com.jbpm3processdoc.xs.stringType first() {return new com.jbpm3processdoc.xs.stringType(owner.getElementFirst(info));}
			public com.jbpm3processdoc.xs.stringType last(){return new com.jbpm3processdoc.xs.stringType(owner.getElementLast(info));}
			public com.jbpm3processdoc.xs.stringType append(){return new com.jbpm3processdoc.xs.stringType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_description_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
	
	public MemberElement_transition transition;

		public static class MemberElement_transition
		{
			public static class MemberElement_transition_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_transition member;
				public MemberElement_transition_Iterator(MemberElement_transition member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
				public boolean hasNext() 
				{
					while (nextNode != null)
					{
						if (com.migration.xml.TypeBase.memberEqualsNode(member.info, nextNode))
							return true;
						nextNode = nextNode.getNextSibling();
					}
					return false;
				}
				
				public Object next()
				{
					transitionType nx = new transitionType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_transition (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public transitionType at(int index) {return new transitionType(owner.getElementAt(info, index));}
			public transitionType first() {return new transitionType(owner.getElementFirst(info));}
			public transitionType last(){return new transitionType(owner.getElementLast(info));}
			public transitionType append(){return new transitionType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_transition_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
}
