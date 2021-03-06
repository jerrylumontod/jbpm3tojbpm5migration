////////////////////////////////////////////////////////////////////////
//
// jbpm3processdoc2.java
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


public class jbpm3processdoc2 extends com.migration.xml.TypeBase
{
		public static com.migration.xml.meta.ComplexType getStaticInfo() { return new com.migration.xml.meta.ComplexType(com.jbpm3processdoc.jbpm3processdoc_TypeInfo.binder.getTypes()[com.jbpm3processdoc.jbpm3processdoc_TypeInfo._altova_ti_altova_jbpm3processdoc2]); }

	public static jbpm3processdoc2 loadFromFile(String filename) throws Exception
	{
		return new jbpm3processdoc2(com.migration.xml.XmlTreeOperations.loadDocument(filename));			
	}

	public static jbpm3processdoc2 loadFromString(String xmlstring) throws Exception
	{
		return new jbpm3processdoc2(com.migration.xml.XmlTreeOperations.loadXml(xmlstring));			
	}

	public static jbpm3processdoc2 loadFromBinary(byte[] binary) throws Exception
	{
		return new jbpm3processdoc2(com.migration.xml.XmlTreeOperations.loadXmlBinary(binary));
	}

	public void saveToFile(String filename, boolean prettyPrint) throws Exception
	{
		saveToFile(filename, prettyPrint, "UTF-8", false, false);
	}
	
	public void saveToFile(String filename, boolean prettyPrint, String encoding) throws Exception
	{
		saveToFile( filename, prettyPrint, encoding, encoding.compareToIgnoreCase("UTF-16BE") == 0, encoding.compareToIgnoreCase("UTF-16") == 0 );
	}

	public void saveToFile(String filename, boolean prettyPrint, String encoding, boolean bBigEndian, boolean bBOM) throws Exception
	{
		org.w3c.dom.Document doc = (org.w3c.dom.Document) getNode();
		com.migration.xml.XmlTreeOperations.saveDocument(doc, filename, encoding, bBigEndian, bBOM, prettyPrint);
	}

	public String saveToString(boolean prettyPrint) throws Exception
	{
		org.w3c.dom.Document doc = (org.w3c.dom.Document) getNode();
		return com.migration.xml.XmlTreeOperations.saveXml(doc, prettyPrint);
	}

	public byte[] saveToBinary(boolean prettyPrint) throws Exception
	{
		return saveToBinary(prettyPrint, "UTF-8", false, false);
	}
	
	public byte[] saveToBinary(boolean prettyPrint, String encoding) throws Exception
	{
		return saveToBinary( prettyPrint, encoding, encoding.compareToIgnoreCase("UTF-16BE") == 0, encoding.compareToIgnoreCase("UTF-16") == 0 );
	}

	public byte[] saveToBinary(boolean prettyPrint, String encoding, boolean bBigEndian, boolean bBOM) throws Exception
	{
		org.w3c.dom.Document doc = (org.w3c.dom.Document) getNode();
		return com.migration.xml.XmlTreeOperations.saveXmlBinary(doc, encoding, bBigEndian, bBOM, prettyPrint);
	}

	public static jbpm3processdoc2 createDocument() throws Exception
	{
		org.w3c.dom.Document doc = com.migration.xml.XmlTreeOperations.createDocument();
		return new jbpm3processdoc2(doc);
	}

	public void setSchemaLocation(String schemaLocation) throws Exception
	{
		org.w3c.dom.Document doc = (org.w3c.dom.Document) node;
		if (doc.getDocumentElement() == null)
			throw new Exception("SetSchemaLocation requires a root element.");
		String namespaceuri = doc.getDocumentElement().getNamespaceURI();
		if (namespaceuri == null || namespaceuri.length() == 0)
			doc.getDocumentElement().setAttributeNS("http://www.w3.org/2001/XMLSchema-instance", "noNamespaceSchemaLocation", schemaLocation);
		else
			doc.getDocumentElement().setAttributeNS("http://www.w3.org/2001/XMLSchema-instance", "schemaLocation", namespaceuri + " " + schemaLocation);
	}

	
	public jbpm3processdoc2(org.w3c.dom.Node init)
	{
		super(init);
		instantiateMembers();
	}
	
	private void instantiateMembers()
	{

		decision= new MemberElement_decision (this, com.jbpm3processdoc.jbpm3processdoc_TypeInfo.binder.getMembers()[com.jbpm3processdoc.jbpm3processdoc_TypeInfo._altova_mi_altova_jbpm3processdoc2._decision]);
		description= new MemberElement_description (this, com.jbpm3processdoc.jbpm3processdoc_TypeInfo.binder.getMembers()[com.jbpm3processdoc.jbpm3processdoc_TypeInfo._altova_mi_altova_jbpm3processdoc2._description]);
		end_state= new MemberElement_end_state (this, com.jbpm3processdoc.jbpm3processdoc_TypeInfo.binder.getMembers()[com.jbpm3processdoc.jbpm3processdoc_TypeInfo._altova_mi_altova_jbpm3processdoc2._end_state]);
		process_definition= new MemberElement_process_definition (this, com.jbpm3processdoc.jbpm3processdoc_TypeInfo.binder.getMembers()[com.jbpm3processdoc.jbpm3processdoc_TypeInfo._altova_mi_altova_jbpm3processdoc2._process_definition]);
		start_state= new MemberElement_start_state (this, com.jbpm3processdoc.jbpm3processdoc_TypeInfo.binder.getMembers()[com.jbpm3processdoc.jbpm3processdoc_TypeInfo._altova_mi_altova_jbpm3processdoc2._start_state]);
		task_node= new MemberElement_task_node (this, com.jbpm3processdoc.jbpm3processdoc_TypeInfo.binder.getMembers()[com.jbpm3processdoc.jbpm3processdoc_TypeInfo._altova_mi_altova_jbpm3processdoc2._task_node]);
		transition= new MemberElement_transition (this, com.jbpm3processdoc.jbpm3processdoc_TypeInfo.binder.getMembers()[com.jbpm3processdoc.jbpm3processdoc_TypeInfo._altova_mi_altova_jbpm3processdoc2._transition]);
	}
	// Attributes


	// Elements
	
	public MemberElement_decision decision;

		public static class MemberElement_decision
		{
			public static class MemberElement_decision_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_decision member;
				public MemberElement_decision_Iterator(MemberElement_decision member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
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
					decisionType nx = new decisionType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_decision (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public decisionType at(int index) {return new decisionType(owner.getElementAt(info, index));}
			public decisionType first() {return new decisionType(owner.getElementFirst(info));}
			public decisionType last(){return new decisionType(owner.getElementLast(info));}
			public decisionType append(){return new decisionType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_decision_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
	
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
	
	public MemberElement_end_state end_state;

		public static class MemberElement_end_state
		{
			public static class MemberElement_end_state_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_end_state member;
				public MemberElement_end_state_Iterator(MemberElement_end_state member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
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
					end_stateType nx = new end_stateType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_end_state (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public end_stateType at(int index) {return new end_stateType(owner.getElementAt(info, index));}
			public end_stateType first() {return new end_stateType(owner.getElementFirst(info));}
			public end_stateType last(){return new end_stateType(owner.getElementLast(info));}
			public end_stateType append(){return new end_stateType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_end_state_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
	
	public MemberElement_process_definition process_definition;

		public static class MemberElement_process_definition
		{
			public static class MemberElement_process_definition_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_process_definition member;
				public MemberElement_process_definition_Iterator(MemberElement_process_definition member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
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
					process_definitionType nx = new process_definitionType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_process_definition (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public process_definitionType at(int index) {return new process_definitionType(owner.getElementAt(info, index));}
			public process_definitionType first() {return new process_definitionType(owner.getElementFirst(info));}
			public process_definitionType last(){return new process_definitionType(owner.getElementLast(info));}
			public process_definitionType append(){return new process_definitionType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_process_definition_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
	
	public MemberElement_start_state start_state;

		public static class MemberElement_start_state
		{
			public static class MemberElement_start_state_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_start_state member;
				public MemberElement_start_state_Iterator(MemberElement_start_state member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
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
					start_stateType nx = new start_stateType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_start_state (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public start_stateType at(int index) {return new start_stateType(owner.getElementAt(info, index));}
			public start_stateType first() {return new start_stateType(owner.getElementFirst(info));}
			public start_stateType last(){return new start_stateType(owner.getElementLast(info));}
			public start_stateType append(){return new start_stateType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_start_state_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
	
	public MemberElement_task_node task_node;

		public static class MemberElement_task_node
		{
			public static class MemberElement_task_node_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_task_node member;
				public MemberElement_task_node_Iterator(MemberElement_task_node member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
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
					task_nodeType nx = new task_nodeType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_task_node (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public task_nodeType at(int index) {return new task_nodeType(owner.getElementAt(info, index));}
			public task_nodeType first() {return new task_nodeType(owner.getElementFirst(info));}
			public task_nodeType last(){return new task_nodeType(owner.getElementLast(info));}
			public task_nodeType append(){return new task_nodeType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_task_node_Iterator(this);}
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

		public void setXsiType() {com.migration.xml.XmlTreeOperations.setAttribute(getNode(), "http://www.w3.org/2001/XMLSchema-instance", "xsi:type", "", "com.jbpm3processdoc");}
}
