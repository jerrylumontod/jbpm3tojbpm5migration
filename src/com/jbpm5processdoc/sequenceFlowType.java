////////////////////////////////////////////////////////////////////////
//
// sequenceFlowType.java
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

package com.jbpm5processdoc;


public class sequenceFlowType extends com.migration.xml.TypeBase
{
		public static com.migration.xml.meta.ComplexType getStaticInfo() { return new com.migration.xml.meta.ComplexType(com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getTypes()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_ti_altova_sequenceFlowType]); }
	
	public sequenceFlowType(org.w3c.dom.Node init)
	{
		super(init);
		instantiateMembers();
	}
	
	private void instantiateMembers()
	{
		targetRef = new MemberAttribute_targetRef (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_sequenceFlowType._targetRef]);
		sourceRef = new MemberAttribute_sourceRef (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_sequenceFlowType._sourceRef]);
		id = new MemberAttribute_id (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_sequenceFlowType._id]);

		conditionExpression= new MemberElement_conditionExpression (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_sequenceFlowType._conditionExpression]);
	}
	// Attributes
	public MemberAttribute_targetRef targetRef;
		public static class MemberAttribute_targetRef
		{
			private com.migration.xml.TypeBase owner;
			private com.migration.typeinfo.MemberInfo info; 
			public MemberAttribute_targetRef (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) {this.owner = owner; this.info = info;}
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
	public MemberAttribute_sourceRef sourceRef;
		public static class MemberAttribute_sourceRef
		{
			private com.migration.xml.TypeBase owner;
			private com.migration.typeinfo.MemberInfo info; 
			public MemberAttribute_sourceRef (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) {this.owner = owner; this.info = info;}
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
	public MemberAttribute_id id;
		public static class MemberAttribute_id
		{
			private com.migration.xml.TypeBase owner;
			private com.migration.typeinfo.MemberInfo info; 
			public MemberAttribute_id (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) {this.owner = owner; this.info = info;}
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
	
	public MemberElement_conditionExpression conditionExpression;

		public static class MemberElement_conditionExpression
		{
			public static class MemberElement_conditionExpression_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_conditionExpression member;
				public MemberElement_conditionExpression_Iterator(MemberElement_conditionExpression member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
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
					conditionExpressionType nx = new conditionExpressionType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_conditionExpression (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public conditionExpressionType at(int index) {return new conditionExpressionType(owner.getElementAt(info, index));}
			public conditionExpressionType first() {return new conditionExpressionType(owner.getElementFirst(info));}
			public conditionExpressionType last(){return new conditionExpressionType(owner.getElementLast(info));}
			public conditionExpressionType append(){return new conditionExpressionType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_conditionExpression_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
}
