////////////////////////////////////////////////////////////////////////
//
// resourceAssignmentExpressionType.java
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


public class resourceAssignmentExpressionType extends com.migration.xml.TypeBase
{
		public static com.migration.xml.meta.ComplexType getStaticInfo() { return new com.migration.xml.meta.ComplexType(com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getTypes()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_ti_altova_resourceAssignmentExpressionType]); }
	
	public resourceAssignmentExpressionType(org.w3c.dom.Node init)
	{
		super(init);
		instantiateMembers();
	}
	
	private void instantiateMembers()
	{

		formalExpression= new MemberElement_formalExpression (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_resourceAssignmentExpressionType._formalExpression]);
	}
	// Attributes


	// Elements
	
	public MemberElement_formalExpression formalExpression;

		public static class MemberElement_formalExpression
		{
			public static class MemberElement_formalExpression_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_formalExpression member;
				public MemberElement_formalExpression_Iterator(MemberElement_formalExpression member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
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
					formalExpressionType nx = new formalExpressionType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_formalExpression (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public formalExpressionType at(int index) {return new formalExpressionType(owner.getElementAt(info, index));}
			public formalExpressionType first() {return new formalExpressionType(owner.getElementFirst(info));}
			public formalExpressionType last(){return new formalExpressionType(owner.getElementLast(info));}
			public formalExpressionType append(){return new formalExpressionType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_formalExpression_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
}
